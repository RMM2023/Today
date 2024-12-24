package com.portfoliormm.today.data.repository

import com.portfoliormm.today.data.remote.BaseCinemaApiService
import com.portfoliormm.today.domain.model.FilmsByWordData
import com.portfoliormm.today.domain.repository.CinemaSearchRepository

class CinemaSearchRepositoryImpl (keyword : String, page : Int) : CinemaSearchRepository {
    override fun searchCinemaKeyWord(keyword: String, page: Int): FilmsByWordData {
        TODO("Not yet implemented")
    }

}