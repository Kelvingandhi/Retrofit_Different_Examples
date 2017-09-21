package com.example.kelvin.retrofit.data.remote;

/**
 * Created by Kelvin on 6/17/2017.
 */
public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
