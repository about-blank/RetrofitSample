package com.vishal.retrofitsample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vishal.retrofitsample.interfaces.FlowerService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vishal Aroor on 16-Aug-17.
 */

public class FlowerApiClient {

    private String baseURL;
    Retrofit retrofit;

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public FlowerApiClient() {}

    public FlowerApiClient(String baseURL) {
        this.baseURL = baseURL;
    }

    public  Retrofit getClient() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder().baseUrl(getBaseURL()).addConverterFactory(GsonConverterFactory.create(gson)).build();
        return retrofit;
    }
}
