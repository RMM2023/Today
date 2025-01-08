package com.portfoliormm.today.data.repository

import android.util.Log
import com.portfoliormm.today.data.remote.BaseCinemaApiService
import com.portfoliormm.today.domain.model.ActorDirectorData
import com.portfoliormm.today.domain.model.FilmsByWordData
import com.portfoliormm.today.domain.model.FilterCinemaData
import com.portfoliormm.today.domain.model.PremierData
import com.portfoliormm.today.domain.model.toDomain
import com.portfoliormm.today.domain.repository.CinemaSearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CinemaSearchRepositoryImpl (val baseCinemaApi: BaseCinemaApiService) : CinemaSearchRepository {
    override suspend fun searchCinemaKeyWord(keyword: String, page: Int): Flow<FilmsByWordData> = flow {
        try {
            val response = baseCinemaApi.getFilmsByKeyword(keyword, page)
            val data = response.toDomain()
            emit(data)
        }catch (e : Exception){
            Log.e("Ошибка", "${e.toString()}")
        }
    }

    override suspend fun searchCinemaFilter(
        countries: List<Int>,
        genres: List<Int>,
        order: String,
        type: String,
        ratingFrom: Int,
        ratingTo: Int,
        yearFrom: Int,
        yearTo: Int,
        imdbId: String,
        keyword: String,
        page: Int
    ): Flow<FilterCinemaData> = flow {
        try {
            val response = baseCinemaApi.getFilterCinema(
                countries,
                genres,
                order,
                type,
                ratingFrom,
                ratingTo,
                yearFrom,
                yearTo,
                imdbId,
                keyword,
                page
            )
            val data = response.toDomain()
            emit(data)
        }catch (e : Exception){
            Log.e("Ошибка", "${e.toString()}")
        }
    }

    override suspend fun searchCinemaActor(filmId : Int): Flow<ActorDirectorData> = flow {
        try {
            val response = baseCinemaApi.getActor(filmId)
            val data = response.toDomain()
            emit(data)
        }catch (e : Exception){
            Log.e("Ошибка", "${e.toString()}")
        }
    }

    override suspend fun searchCinemaPremier(year: Int, month: String): Flow<PremierData> = flow {
        try {
            val response = baseCinemaApi.getPremier(year, month)
        }catch (e : Exception){
            Log.e("Ошибка", "${e.toString()}")
        }
    }



}