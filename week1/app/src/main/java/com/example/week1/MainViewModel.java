package com.example.week1;

import android.graphics.Color;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel {

    // Mutable means we can read and write
    private final MutableLiveData<String> _count = new MutableLiveData<>("0");
    private int count = 0;

    public void updateCount() {
        // TODO: 1/10/22 Write logic to increase the count and update the livedata using (setValue)
        count++;
        _count.setValue(String.valueOf(count));
    }

    public int getRandomColor() {
        return Color.argb(
                new Random().nextInt(255),
                new Random().nextInt(255),
                new Random().nextInt(255),
                new Random().nextInt(255)

        );
    }

    // This is read only version of MutableLiveData, so this means who ever calls this will only get updates
    // and won't be able to update the LiveData
    public LiveData<String> getCount() {
        return _count;
    }
    public void resetCount() {
        count = 0;
        _count.setValue(String.valueOf(count));
    }
}