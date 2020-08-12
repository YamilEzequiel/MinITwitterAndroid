package com.hobbyappgame.minitwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MiniTwitterClient miniTwitterClient = MiniTwitterClient.getInstance();
        MiniTwitterService miniTwitterService = miniTwitterClient.getSingletonService();


        RequestLogin requestLogin=new RequestLogin("email","password");

        Call<ResponseAuth> call= miniTwitterService.doLogin(requestLogin);

        call.enqueue(new Callback<ResponseAuth>() {
            @Override
            public void onResponse(Call<ResponseAuth> call, Response<ResponseAuth> response) {

            }

            @Override
            public void onFailure(Call<ResponseAuth> call, Throwable t) {

            }
        });



    }
}
