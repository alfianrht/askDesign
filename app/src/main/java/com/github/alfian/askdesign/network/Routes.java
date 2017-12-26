package com.github.alfian.askdesign.network;

import com.github.alfian.askdesign.model.Users;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by aufa18 on 27/12/17.
 */

public interface Routes {

    @FormUrlEncoded @POST("users")
    Call<Response<Users>> registerUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password
    );

}
