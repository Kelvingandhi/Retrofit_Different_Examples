package com.example.kelvin.retrofit.php_data;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.kelvin.retrofit.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by Kelvin on 9/18/2017.
 */

public class AndroidListActivity extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<Android_version_model> android_version_models;
    private RecyclerAdapter adapter;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycler_view_list_phpdata);

        recyclerView = (RecyclerView) findViewById(R.id.php_recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        fetchInfo();


    }

    private void fetchInfo() {

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Android_version_model>> call = apiInterface.getAndroidInfo();

        call.enqueue(new Callback<List<Android_version_model>>() {
            @Override
            public void onResponse(Call<List<Android_version_model>> call, Response<List<Android_version_model>> response) {

                android_version_models = response.body();
                Log.d(TAG, "onResponse: "+android_version_models);
                adapter = new RecyclerAdapter(android_version_models,AndroidListActivity.this);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Android_version_model>> call, Throwable t) {

            }
        });

    }
}
