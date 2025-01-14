package com.portfoliormm.today.presentation.ui.fragments.cinema

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.portfoliormm.today.databinding.FragmentMyCinemaBinding
import com.portfoliormm.today.presentation.viewmodel.CinemaViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MyCinemaFragment : Fragment() {

    private lateinit var adapterRecomended :CinemaAdapter // объявляеются переменные адаптеров
    private lateinit var adapterNew : CinemaAdapter // как вверху
    private lateinit var binding: FragmentMyCinemaBinding
    private val cinemaViewModel : CinemaViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyCinemaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapters()
        setupListeners()
        observeViewModel()
    }

    override fun onResume() {
        super.onResume()
        cinemaViewModel.searchRecomendedFilms()
    }

    fun setupListeners(){

    //здесь будет кликабельность кнопки фильтр
    }

    fun setupAdapters(){
        adapterRecomended = CinemaAdapter(mutableListOf()) //инициализировали адаптер
        binding.recRecommendationsCinema.apply {
            adapter = adapterRecomended
            layoutManager = LinearLayoutManager(requireContext()) //с запросом контекста у родительского Activity
        }
        adapterNew = CinemaAdapter(mutableListOf())
        binding.recPremierCinema.apply {
            adapter = adapterNew
            layoutManager = LinearLayoutManager(requireContext())
        }
    //здесь будет инициализация recyclerview
    }

    fun observeViewModel(){
        cinemaViewModel.recomendedFilms.observe(viewLifecycleOwner){filter->
            adapterRecomended.updateAdapter(filter)//здесь будет заполнение recyclerview
        }
    }
}