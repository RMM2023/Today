package com.portfoliormm.today.di

import com.portfoliormm.today.data.remote.BaseCinemaApiService
import com.portfoliormm.today.data.repository.CinemaSearchRepositoryImpl
import com.portfoliormm.today.domain.interactor.CinemaSearchInteractor
import com.portfoliormm.today.domain.repository.CinemaSearchRepository
import com.portfoliormm.today.presentation.viewmodel.CinemaViewModel
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Headers
import kotlin.math.sin

val dataModule = module {
        single<BaseCinemaApiService> {
            val interceptorHttp = HttpLoggingInterceptor().apply {
                this.level = HttpLoggingInterceptor.Level.BODY
            }
            val headers = Headers
                .Builder()
                .add("X-API-KEY: 2f79b4d9-358a-4b37-8a95-04009e53e632")
                .add("Content-Type: application/json").build()

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(interceptorHttp)
                .addInterceptor(Interceptor { chain: Interceptor.Chain ->
                    val request = chain.request().newBuilder().headers(headers).build()
                    chain.proceed(request)
                })
                .build()
            Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://kinopoiskapiunofficial.tech")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BaseCinemaApiService::class.java)
        }

}
val domainModule = module {
    single<CinemaSearchRepository> {
        CinemaSearchRepositoryImpl(get())
    }
    single {
        CinemaSearchInteractor(get())
    }
}
val viewModelModule = module {
    viewModel{
        CinemaViewModel(get())
    }
}