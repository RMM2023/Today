package com.portfoliormm.today.presentation.ui.fragments.cinema

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.portfoliormm.today.databinding.FragmentMyCinemaBinding
import com.portfoliormm.today.presentation.viewmodel.CinemaViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MyCinemaFragment : Fragment() {

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

    fun setupListeners(){

    //здесь будет кликабельность кнопок
    }

    fun setupAdapters(){
        //здесь будет инициализация recyclerview
    }

    fun observeViewModel(){
        cinemaViewModel.recomendedFilms.observe(viewLifecycleOwner){filmContainer->
            //здесь будет заполнение recyclerview
        }
    }
}