package com.portfoliormm.today.domain.repository

import com.portfoliormm.today.domain.model.ActorDirectorData
import com.portfoliormm.today.domain.model.FilmsByWordData
import com.portfoliormm.today.domain.model.FilterCinemaData
import com.portfoliormm.today.domain.model.PremierData
import kotlinx.coroutines.flow.Flow

interface CinemaSearchRepository {
    suspend fun searchCinemaKeyWord(keyword : String, page : Int) : Flow<FilmsByWordData>
    suspend fun searchCinemaFilter(
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
    ) : Flow<FilterCinemaData>
    suspend fun searchCinemaPremier(year : Int, month : String) : Flow<PremierData>
    suspend fun searchCinemaActor(filmId  : Int) : Flow<ActorDirectorData>
}