package com.thinkcode.spacex_tracker.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel
import com.thinkcode.spacex_tracker.databinding.LaunchesItemBinding

class LaunchesViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = LaunchesItemBinding.bind(view)

    fun render(launch:LaunchesUpcomingModel){
        binding.tvName.text=launch.name.toString()
        binding.tvdate.text=launch.date_local.toString()

    }

}