package com.thinkcode.spacex_tracker.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thinkcode.spacex_tracker.R
import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel

class LaunchesAdapter(val launchList:List<LaunchesUpcomingModel>):RecyclerView.Adapter<LaunchesViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchesViewHolder {

        val layoutInflater= LayoutInflater.from(parent.context)
        return LaunchesViewHolder(layoutInflater.inflate(R.layout.launches_item,parent,false))

    }

    override fun onBindViewHolder(holder: LaunchesViewHolder, position: Int) {

        val item = launchList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int =launchList.size

}