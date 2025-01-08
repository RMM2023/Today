package com.portfoliormm.today.presentation.ui.fragments.cinema

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.portfoliormm.today.R

class CinemaAdapter(var list : MutableList<FilmItemData>) : RecyclerView.Adapter<CinemaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_cinema, parent, false)

        return CinemaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.bind(list [position])
    }

    fun updateAdapter(newlist : MutableList<FilmItemData>){
        list = newlist
        notifyDataSetChanged()
    }

    fun clearAdapter(){
        list.clear()
    }

}