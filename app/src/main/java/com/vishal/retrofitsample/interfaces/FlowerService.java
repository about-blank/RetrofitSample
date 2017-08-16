package com.vishal.retrofitsample.interfaces;

import com.vishal.retrofitsample.collection.FlowerCollection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Vishal Aroor on 16-Aug-17.
 */

public interface FlowerService {

    @GET("coGUFiJJmG")
    Call<FlowerCollection> getFlowerList();
}
