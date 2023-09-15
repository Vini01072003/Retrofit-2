package br.senai.sp.jandira.retrofit_api_livraria

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroofitHelper {
    private const val baseurl = "https://localhost:3000"

    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}