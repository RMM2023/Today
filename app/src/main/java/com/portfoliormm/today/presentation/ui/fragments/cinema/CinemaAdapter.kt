package com.portfoliormm.today.presentation.ui.fragments.cinema

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.portfoliormm.today.R
import com.portfoliormm.today.domain.model.FilterCinemaData

class CinemaAdapter(var list : MutableList<FilmItemData>) : RecyclerView.Adapter<CinemaViewHolder>() {
    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : CinemaViewHolder {
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

    fun updateAdapter(filter : FilterCinemaData){//дполнение функции адаптер чтобы могла принимать фильтр
        val newlist : MutableList<FilmItemData> = mutableListOf()//создаем временный лист
        filter.items.forEach{//проходимся по списку фильмов из фильтра
            val film = FilmItemData(//создаем экземпляр FilmItemData для каждого из фильмов фильтра
                name = it.nameRu,//переводим переменную из фильтра в новую
                poster = it.posterUrl,//переводим переменную из фильтра в новую
                favourite = false//переводим переменную из фильтра в новую
            )
            newlist.add(film)//добовляем полученный экземпляр к временному списку
        }
        updateAdapter(newlist)//вызываем базовую функцию передавая ей временный список
    }

    fun clearAdapter(){
        list.clear()
    }

}