package com.stefan.viewmp_tutorial_2072013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import com.stefan.viewmp_tutorial_2072013.databinding.ActivityMainBinding
import com.stefan.viewmp_tutorial_2072013.entity.NameViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stefan.viewmp_tutorial_2072013.adapter.NameListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: NameViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initialize the NameViewModel to implement the View Model
        viewModel = ViewModelProvider(this).get(NameViewModel::class.java)

        //Setting up the adapter (memasang adapter)
        val recyclerView = binding.nameRecyclerView
        val adapter = NameListAdapter(viewModel)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //The observe() method allows an activity or fragment to be notified of changes to a MutableLiveData
        // object in a ViewModel class, and update the UI accordingly.
        // It is part of the LiveData class, which is a lifecycle-aware data holder.
        viewModel._names.observe(this, {
            adapter.updateNames()
        })

        //Add Button to add the text to the viewModel that will be inputted to the Name class, then
        //clear the edit text after the button is pressed
        binding.addButton.setOnClickListener {
            viewModel.addName(binding.nameEditText.text.toString())
            binding.nameEditText.setText("")
        }

    }
}