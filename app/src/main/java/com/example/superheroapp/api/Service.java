package com.example.superheroapp.api;

import com.example.superheroapp.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:android+location:johannesburg")
    //@GET("/api/access-token/")
    Call<ItemResponse> getItems();
}
