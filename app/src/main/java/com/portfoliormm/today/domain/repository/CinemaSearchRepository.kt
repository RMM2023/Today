package com.portfoliormm.today.domain.repository

import com.portfoliormm.today.domain.model.FilmsByWordData
import kotlinx.coroutines.flow.Flow

interface CinemaSearchRepository {
    fun searchCinemaKeyWord(keyword : String, page : Int) : Flow<FilmsByWordData>
    //fun searchCinemaFilter()
    //fun searchCinemaPremier(year : Int, month : String) :
    //
// fun searchCinemaActor()
}