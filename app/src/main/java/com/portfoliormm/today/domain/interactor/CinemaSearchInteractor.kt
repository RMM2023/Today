package com.portfoliormm.today.domain.interactor

import com.portfoliormm.today.domain.model.ActorDirectorData
import com.portfoliormm.today.domain.model.FilmsByWordData
import com.portfoliormm.today.domain.model.FilterCinemaData
import com.portfoliormm.today.domain.model.PremierData
import com.portfoliormm.today.domain.repository.CinemaSearchRepository
import kotlinx.coroutines.flow.Flow

class CinemaSearchInteractor(val cinemaSearch : CinemaSearchRepository) {
    fun searchCinemaKeyWord(keyword : String, page : Int) : Flow<FilmsByWordData>{
        return cinemaSearch.searchCinemaKeyWord(keyword, page)
    }
    fun searchCinemaFilter(
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
    ) : Flow<FilterCinemaData>{
        return cinemaSearch.searchCinemaFilter(countries,
            genres,
            order,
            type,
            ratingFrom,
            ratingTo,
            yearTo,
            imdbId,
            keyword,
            page)
    }
    fun searchCinemaPremier(year : Int, month : String) : Flow<PremierData>{
        return cinemaSearch.searchCinemaPremier(year,month)
    }
    fun searchCinemaActor(filmId  : Int) : Flow<ActorDirectorData>{
        return cinemaSearch.searchCinemaActor(filmId)
    }
}