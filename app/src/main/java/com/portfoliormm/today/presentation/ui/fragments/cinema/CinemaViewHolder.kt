package com.portfoliormm.today.presentation.ui.fragments.cinema

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.portfoliormm.today.R
import com.portfoliormm.today.databinding.ListCinemaBinding
import com.portfoliormm.today.domain.model.FilmsData

class CinemaViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val binding = ListCinemaBinding.bind(view)

    fun bind(films : FilmItemData) {
        binding.textCinema.text = films.name
        Glide.with(binding.root)
            .load(films.poster)
            .into(binding.imageCinema)
        if (films.favourite){
            binding.favoriteIcon.setImageResource(R.drawable.like_red)
        }else{
            binding.favoriteIcon.setImageResource(R.drawable.like_grey)
        }
    }
}
data class FilmItemData(
    val name : String,
    val poster : String,
    val favourite : Boolean
)