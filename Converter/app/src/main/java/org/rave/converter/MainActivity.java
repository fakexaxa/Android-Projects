package org.rave.converter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import org.rave.converter.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    // TODO: 2 Declare binding and viewModel
        private ActivityMainBinding binding;
        private MainViewModel viewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: 3 init binding and setContentView
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // TODO: 4 init viewmodel

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);


        // TODO: 5 call initialization methods
        initViews();
        initObservers();

    }

    private void initViews() {
        // TODO: 6a run app notice kilograms does work correctly
        binding.poundsToKilograms.listenToTextChange(sequence -> viewModel.convertToKilograms(sequence));
        binding.poundsToOunces.listenToTextChange(sequence -> viewModel.convertToOunces(sequence));
        // TODO: 7a setup rest of other convertor views for pounds conversions
        binding.poundsToStones.listenToTextChange(sequence -> viewModel.convertToStone(sequence) );

        binding.kilogramsToPounds.listenToTextChange(sequence -> viewModel.convertToPounds(sequence));
        // TODO: 8 do the same you just did for pounds for kilograms

        binding.kilogramsToGrams.listenToTextChange(sequence -> viewModel.convertToGram(sequence) );
        binding.kilogramsToMilligrams.listenToTextChange(sequence -> viewModel.convertToMilligram(sequence));
    }

    private void initObservers() {
        viewModel.getKilograms().observe(this, this::displayFormattedKilograms);
        viewModel.getPounds().observe(this, this::displayFormattedPounds);

        // TODO: 7g setup new observers
        viewModel.getOunce().observe(this,this::displayFormattedOunce);
        viewModel.getStone().observe(this,this::displayFormattedStone);
        viewModel.getGram().observe(this,this::displayFormattedGram);
        viewModel.getMilligram().observe(this,this::displayFormattedMilligram);
    }



    private void displayFormattedKilograms(String text) {
        String formattedKilogramsText = getString(R.string.kilogram_s_value, text);
        binding.poundsToKilograms.updateDisplay(formattedKilogramsText);
    }

    private void displayFormattedPounds(String text) {
        String formattedPoundsText = getString(R.string.pound_s_value, text);
        binding.kilogramsToPounds.updateDisplay(formattedPoundsText);
    }
    // TODO: 7f Add your other methods below to display formatted string values
    private void displayFormattedOunce(String text) {
        String formattedOunceText= getString(R.string.ounce_s_value, text);
        binding.poundsToOunces.updateDisplay(formattedOunceText);
    }
    private void displayFormattedStone(String text) {
        String formattedStoneText= getString(R.string.stone_s_value, text);
        binding.poundsToStones.updateDisplay(formattedStoneText);
    }
    private void displayFormattedGram(String text) {
        String formattedGramText= getString(R.string.gram_s_value, text);
        binding.kilogramsToGrams.updateDisplay(formattedGramText);
    }
    private void displayFormattedMilligram(String text) {
        String formattedMilligramText= getString(R.string.milligram_s_value, text);
        binding.kilogramsToMilligrams.updateDisplay(formattedMilligramText);
    }
}