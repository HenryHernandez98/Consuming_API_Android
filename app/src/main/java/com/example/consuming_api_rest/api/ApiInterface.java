package com.example.consuming_api_rest.api;

import com.example.consuming_api_rest.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    //Method GET
    @GET("Product")
    Call<List<Product>> getComplaints();

}
