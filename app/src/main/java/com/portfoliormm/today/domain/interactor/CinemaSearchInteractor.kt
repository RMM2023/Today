package com.portfoliormm.today.domain.interactor

import com.portfoliormm.today.domain.model.ActorDirectorData
import com.portfoliormm.today.domain.model.FilmsByWordData
import com.portfoliormm.today.domain.model.FilterCinemaData
import com.portfoliormm.today.domain.model.PremierData
import com.portfoliormm.today.domain.repository.CinemaSearchRepository
import kotlinx.coroutines.flow.Flow

class CinemaSearchInteractor(val cinemaSearchRepository : CinemaSearchRepository) {
    suspend fun searchCinemaKeyWord(keyword : String, page : Int) : Flow<FilmsByWordData>{
        return cinemaSearchRepository.searchCinemaKeyWord(keyword, page)
    }
    suspend fun searchCinemaFilter(
        countries: List<Int> = emptyList(),
        genres: List<Int> = emptyList(),
        order: String = "RATING",
        type: String = "ALL",
        ratingFrom: Int = 0,
        ratingTo: Int = 10,
        yearFrom: Int = 1000,
        yearTo: Int = 3000,
        imdbId: String = "",
        keyword: String = "",
        page: Int = 1
    ) : Flow<FilterCinemaData>{
        return cinemaSearchRepository.searchCinemaFilter(countries,
            genres,
            order,
            type,
            ratingFrom,
            ratingTo,
            yearFrom,
            yearTo,
            imdbId,
            keyword,
            page)
    }
    suspend fun searchCinemaPremier(year : Int, month : String) : Flow<PremierData>{
        return cinemaSearchRepository.searchCinemaPremier(year,month)
    }
    suspend fun searchCinemaActor(filmId  : Int) : Flow<ActorDirectorData>{
        return cinemaSearchRepository.searchCinemaActor(filmId)
    }
}