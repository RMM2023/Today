package com.portfoliormm.today.di

import com.portfoliormm.today.data.remote.BaseCinemaApiService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Headers

val datamodule = module {
        single<BaseCinemaApiService> {
            Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://kinopoiskapiunofficial.tech")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BaseCinemaApiService::class.java)
        }
    single {
        val headers = Headers
        .Builder()
        .add("X-API-KEY: 2f79b4d9-358a-4b37-8a95-04009e53e632")
        .add("Content-Type: application/json").build()
    }
    single {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptorHttp)
            .addInterceptor(Interceptor { chain: Interceptor.Chain ->
                val request = chain.request().newBuilder().headers(headers).build()
                chain.proceed(request)
            })
            .build()
    }

}