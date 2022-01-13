package org.rave.converter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> _kilograms = new MutableLiveData<>();
    private final MutableLiveData<String> _pounds = new MutableLiveData<>();

    // TODO: 7b Create MutableLiveData for each new conversion result
    private final MutableLiveData<String> _ounce = new MutableLiveData<>();
    private final MutableLiveData<String> _stone = new MutableLiveData<>();
    private final MutableLiveData<String> _gram = new MutableLiveData<>();
    private final MutableLiveData<String> _milligram = new MutableLiveData<>();

    public LiveData<String> getKilograms() {
        return _kilograms;
    }

    public LiveData<String> getPounds() {
        return _pounds;
    }


    // TODO: 7c Create LiveData getters for each new conversion result
    public MutableLiveData<String> getOunce() {
        return _ounce;
    }

    public MutableLiveData<String> getStone() {
        return _stone;
    }

    public MutableLiveData<String> getGram() {
        return _gram;
    }
    public MutableLiveData<String> getMilligram() {
        return _milligram;
    }


    // TODO: 6b Update this method to have correct logic to convert to kilograms
    public void convertToKilograms(CharSequence value) {
        float kilograms = 0f;
        if (value != null && !value.toString().isEmpty()) {
            float floatValue = Float.parseFloat(value.toString());
            kilograms = floatValue * 0.453f;
        }
        _kilograms.setValue(String.valueOf(kilograms));
    }

    public void convertToPounds(CharSequence value) {
        float pounds = 0f;
        if (value != null && !value.toString().isEmpty()) {
            float floatValue = Float.parseFloat(value.toString());
            pounds = floatValue * 2.205f;
        }
        _pounds.setValue(String.valueOf(pounds));
    }




    // TODO: 7d Create the logic for other converters and update the livedata
    public void convertToOunces(CharSequence value) {
        float ounce = 0f;
        if (value != null && !value.toString().isEmpty()) {
            float floatValue = Float.parseFloat(value.toString());
            ounce = floatValue * 16.000f;
        }
        _ounce.setValue(String.valueOf(ounce));
    }
    public void convertToStone(CharSequence value) {
        float stone = 0f;
        if (value != null && !value.toString().isEmpty()) {
            float floatValue = Float.parseFloat(value.toString());
            stone = floatValue * 0.0714f;
        }
        _stone.setValue(String.valueOf(stone));
    }
    public void convertToGram(CharSequence value) {
        float gram = 0f;
        if (value != null && !value.toString().isEmpty()) {
            float floatValue = Float.parseFloat(value.toString());
            gram = floatValue * 1000.000f;
        }
        _gram.setValue(String.valueOf(gram));
    }
    public void convertToMilligram(CharSequence value) {
        float mg = 0f;
        if (value != null && !value.toString().isEmpty()) {
            float floatValue = Float.parseFloat(value.toString());
            mg = floatValue * 1000000.000f;
        }
        _milligram.setValue(String.valueOf(mg));
    }

}