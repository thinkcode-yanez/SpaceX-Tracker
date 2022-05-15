package com.thinkcode.spacex_tracker.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thinkcode.spacex_tracker.data.DataRespository
import com.thinkcode.spacex_tracker.data.model.LaunchesUpcomingModel
import com.thinkcode.spacex_tracker.databinding.ActivityMainBinding
import com.thinkcode.spacex_tracker.ui.adapter.LaunchesAdapter
import com.thinkcode.spacex_tracker.ui.viewmodel.QuoteViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    private lateinit var adapter: LaunchesAdapter

    private val launchlist = mutableListOf<LaunchesUpcomingModel>()

    private val respository = DataRespository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        startLaunchesList()

        /* quoteViewModel.quoteModel.observe(this, Observer {
             binding.tvQuote.text=it.quote
             binding.tvAuthor.text=it.author
         })

         binding.viewContainer.setOnClickListener {
             quoteViewModel.randomQuote()
         }*/

    }

    private fun initRecyclerView() {
        adapter = LaunchesAdapter(launchlist)
        binding.rvLaunches.layoutManager = LinearLayoutManager(this)
        binding.rvLaunches.adapter = adapter
    }

    private fun startLaunchesList() {

        CoroutineScope(Dispatchers.IO).launch {
            val lista = respository.getAllUpcomingLaunches()
            runOnUiThread {
                launchlist.clear()
                launchlist.addAll(lista)
                adapter.notifyDataSetChanged()
            }


        }


    }


}