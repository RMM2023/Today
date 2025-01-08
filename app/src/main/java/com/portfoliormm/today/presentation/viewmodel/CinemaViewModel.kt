package com.portfoliormm.today.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.portfoliormm.today.domain.interactor.CinemaSearchInteractor
import com.portfoliormm.today.domain.model.FilterCinemaData
import com.portfoliormm.today.domain.model.PremierData
import kotlinx.coroutines.launch

class CinemaViewModel(private val cinemaSearchInteractor: CinemaSearchInteractor) : ViewModel() {

    private val _searchResultsCinemaPremier = MutableLiveData<List<PremierData>>()
    val searchResultsCinemaPremier : LiveData<List<PremierData>> = _searchResultsCinemaPremier

    private val _recomendedFilms = MutableLiveData<FilterCinemaData>()
    val recomendedFilms : LiveData<FilterCinemaData> = _recomendedFilms

    fun searchRecomendedFilms(){
        try {
            viewModelScope.launch {
                val result = cinemaSearchInteractor.searchCinemaFilter().collect{list->
                    _recomendedFilms.value = list
                }
            }
        }catch (e:Exception){

        }
    }
}