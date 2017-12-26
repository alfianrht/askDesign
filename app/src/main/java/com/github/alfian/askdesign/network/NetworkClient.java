package com.github.alfian.askdesign.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by aufa18 on 27/12/17.
 */

public class NetworkClient {

    public static Retrofit client() {
        return new Retrofit.Builder()
                .baseUrl("http://192.168.8.101:1337/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
