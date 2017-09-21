package com.example.kelvin.retrofit.php_data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kelvin on 9/18/2017.
 */

public interface ApiInterface {

    @GET("android_version_db.php")
    Call<List<Android_version_model>> getAndroidInfo();

}
