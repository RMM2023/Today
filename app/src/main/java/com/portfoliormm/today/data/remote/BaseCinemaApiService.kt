package com.portfoliormm.today.data.remote

import com.portfoliormm.today.data.model.ActorDirectorResponse
import com.portfoliormm.today.data.model.BaseCinemaResponse
import com.portfoliormm.today.data.model.BudgetResponse
import com.portfoliormm.today.data.model.FilmsByWordResponse
import com.portfoliormm.today.data.model.FilterCinemaResponse
import com.portfoliormm.today.data.model.PremiereResponse
import com.portfoliormm.today.data.model.WebsiteResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BaseCinemaApiService {
    @GET("/api/v2.2/films/{id}")
    suspend fun searchFilms(@Path("id") id: Int): BaseCinemaResponse

    @GET("/api/v2.2/films/{id}/box_office")
    suspend fun getBox(@Path("id") id: Int): BudgetResponse

    @GET("/api/v2.1/films/search-by-keyword")
    suspend fun getFilmsByKeyword(
        @Query("keyword") keyword: String,
        @Query("page") page: Int
    ): FilmsByWordResponse

    @GET("/api/v2.2/films/{id}/external_sources")
    suspend fun getWebsite(@Path("id") id: Int, @Query("page") page: Int): WebsiteResponse

    @GET("/api/v2.2/films")
    suspend fun getFilterCinema(
        @Query("countries") countries: List<Int>,
        @Query("genres") genres: List<Int>,
        @Query("order") order: String,
        @Query("type") type: String,
        @Query("ratingFrom") ratingFrom: Int,
        @Query("ratingTo") ratingTo: Int,
        @Query("yearFrom") yearFrom: Int,
        @Query("yearTo") yearTo: Int,
        @Query("imdbId") imdbId: String,
        @Query("keyword") keyword: String,
        @Query("page") page: Int
    ): FilterCinemaResponse

    @GET("//api/v2.2/films/premieres")
    suspend fun getPremier(@Query("year") year : Int, @Query("month") month : String): PremiereResponse

    @GET("/api/v1/staff")
    suspend fun getActor(@Path("filmId") filmId  : Int): ActorDirectorResponse
}