package com.example.kelvin.retrofit.php_data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kelvin on 9/18/2017.
 */

public class ApiClient {

    public static String BASEURL="http://192.168.1.174:4545/android/";
    public static Retrofit retrofit;

    public static Retrofit getApiClient(){

        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASEURL)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
        }
        return retrofit;
    }


}
