package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://covid-193.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CovidInfoService service = retrofit.create(CovidInfoService.class);
        Call<CovidHistory> call = service.covidHistory("usa","2020-04-02");
        call.enqueue(new Callback<CovidHistory>() {
            @Override
            public void onResponse(Call<CovidHistory> call, Response<CovidHistory> response) {

            }

            @Override
            public void onFailure(Call<CovidHistory> call, Throwable t) {

            }
        });
    }
}