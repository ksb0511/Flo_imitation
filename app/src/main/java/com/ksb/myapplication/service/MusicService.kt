package com.ksb.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {


    @GET("/v3/9f853a2a-62b3-48f4-91d5-65eabd0b32f5")
    fun listMusics() : Call<MusicDto>
}

abstract class func {
    final var x = 0;
    var y = 0;
}