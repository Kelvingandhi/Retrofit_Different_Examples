package com.example.kelvin.retrofit.php_data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kelvin.retrofit.R;

import java.util.List;

/**
 * Created by Kelvin on 9/18/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    List<Android_version_model> android_version_models;
    Context context;

    public RecyclerAdapter(List<Android_version_model> android_version_models, Context context) {
        this.android_version_models = android_version_models;
        this.context = context;
    }

    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.php_data_details,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.versionName.setText(android_version_models.get(position).getVersionName());
        holder.API.setText(android_version_models.get(position).getApi());
        Glide.with(context)
                .load(android_version_models.get(position).getImg_path())
                .into(holder.logo);

    }

    @Override
    public int getItemCount() {
        return android_version_models.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView logo;
        TextView versionName, API;

        public MyViewHolder(View itemView) {
            super(itemView);

            logo = (ImageView) itemView.findViewById(R.id.version_logo);
            versionName = (TextView) itemView.findViewById(R.id.version_name);
            API = (TextView) itemView.findViewById(R.id.api_level_data);



        }
    }

}
