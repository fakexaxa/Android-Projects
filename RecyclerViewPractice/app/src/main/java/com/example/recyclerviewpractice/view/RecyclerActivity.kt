package com.example.recyclerviewpractice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice.R
import com.example.recyclerviewpractice.adapter.FoodItemAdapter
import com.example.recyclerviewpractice.databinding.ActivityRecyclerBinding
import com.example.recyclerviewpractice.viewmodel.MainViewModel

// TODO: 1/19/22
//  VIEW
//  1) Setup Recyclerview in xml
//  2) Setup Binding
//  2) Setup ViewModel *don't forget your dependency*
//  3) Observe the livedata in View
//  4) Create Adapter for the recyclerview that takes List<FoodItem>
//  VIEW MODEL
//  1) Update ViewModel livedata to return mockList from MockData file in util package rather than emptyList()
//  BONUS
//  Display toast with foodItem name its clicked
//  Add icon in toolbar to switch from linear or grid view



class RecyclerActivity : AppCompatActivity(), FoodItemAdapter.OnItemClickListener {

    private val bindingLazy by lazy { ActivityRecyclerBinding.inflate(layoutInflater) }
    private val viewModel by lazy { MainViewModel() }
    private val adapter by lazy { FoodItemAdapter(this) }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindingLazy.root)
        initViews()
        initObservers()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.m_list -> {
                bindingLazy.rvDisplay.layoutManager=LinearLayoutManager(this@RecyclerActivity)
                true
            }
            R.id.m_grid -> {
                bindingLazy.rvDisplay.layoutManager=GridLayoutManager(this@RecyclerActivity,2)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }




    private fun initViews() = with(bindingLazy){
        rvDisplay.layoutManager = LinearLayoutManager(this@RecyclerActivity)
        rvDisplay.adapter = adapter

    }

    override fun onItemClick(name: String) {
        Toast.makeText(this@RecyclerActivity, "You clicked $name",
            Toast.LENGTH_SHORT).show()
    }

    private fun initObservers()= with(viewModel) {
        foodItemList.observe(this@RecyclerActivity) {
            adapter.loadList(it)
        }
    }


}