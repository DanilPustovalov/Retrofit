package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public class CovidInfoService {
    public interface CovidInterface {
        @GET("history")
        @Headers({
                "X-RapidAPI-Host: covid-193.p.rapidapi.com",
                "X-RapidAPI-Key: 2ec253d014msh98189487d6b499bp1d03c2jsn2ab4b4a80c84"

        })
        Call<CovidHistory> covidInfo(@Query("country") String country, @Query("day") String day);
    }
}
