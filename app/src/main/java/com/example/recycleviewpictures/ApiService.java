package com.example.recycleviewpictures;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("200/")
    Call<List<Pictures>> getFile();
}
