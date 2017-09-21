package com.example.kelvin.retrofit.json_data;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kelvin on 6/21/2017.
 */
public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();

}
