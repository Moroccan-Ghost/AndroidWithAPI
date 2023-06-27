package com.example.androidwithapi;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface myapi {
    @FormUrlEncoded
    @POST("inserttask.php")
    Call<JsonObject> addtask(@Field("task") String task);

    @GET("getalltasks.php")
    Call<List<Task>> getalltasks();
}