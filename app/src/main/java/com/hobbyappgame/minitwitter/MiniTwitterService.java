package com.hobbyappgame.minitwitter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public abstract class MiniTwitterService {

    @POST("auth/login")
    abstract Call<ResponseAuth> doLogin(@Body RequestLogin requestLogin);



}
