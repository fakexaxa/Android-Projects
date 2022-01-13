package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.week1.databinding.ActivityMainBinding;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        initViews();

        binding.tvDisplay.setTextColor(Color.RED);

    }

    private void initViews() {
        // This lets us listen to click events when the button is pressed
        binding.btnTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 1/10/22 This click will be trigged when the button is clicked
                //  Update the count in viewmodel when it is clicked
                viewModel.updateCount();
                view.setBackgroundColor(viewModel.getRandomColor());
            }


        });
        //this let us listen to long click events when button is pressed
        binding.btnTap.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                viewModel.resetCount();
                return true;
            }
        });

        // Everytime the count livedata in the viewModel is updated this will be triggered
        viewModel.getCount().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String count) {
                // TODO: 1/10/22 Display the count to tvDisplay using the binding variable
                binding.tvDisplay.setText(count);
                binding.tvDisplay.setBackgroundColor(viewModel.getRandomColor());
            }
        });
        //works same with other observer
        //viewModel.getCount().observe(this,this::onChanged());

    }
    //TODO: 1/10/22 Display the count to tvDisplay using the binding variable
    /**
     *  need to create this method if we want to use the shortcut
     *  public void onChanged(String text) {
     *
     *         binding.tvDisplay.setText(text);
     *         binding.tvDisplay.setBackgroundColor(viewModel.getRandomColor());
     *         }
     */


}