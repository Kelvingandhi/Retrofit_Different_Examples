package com.example.kelvin.retrofit.data.remote;

import com.example.kelvin.retrofit.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Kelvin on 6/17/2017.
 */
public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);

}
