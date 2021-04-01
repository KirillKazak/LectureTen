package com.example.lectureten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] array = {5, 4, 10, 15, 8, 11, 9, 17};

        int maxNumber = findMaxNumber(array);
        int minNumber = findMinNumber(array);
        Log.i("TAGMAX", String.valueOf(maxNumber));
        Log.i("TAGMIN", String.valueOf(minNumber));
        getNumbersUnderPairIndex(array);
        getPairNumbers(array);
        getNotpairNumbers(array);
    }

    public Integer findMaxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public Integer findMinNumber(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    public void getNumbersUnderPairIndex (int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                Log.i("TAGPairIndex", String.valueOf(array[i]));
            }
        }
    }

    public void getPairNumbers (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                Log.i("TAGPairNumber", String.valueOf(array[i]));
            }
        }
    }

    public void getNotpairNumbers (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                Log.i("TAGNotpairNumber", String.valueOf(array[i]));
            }
        }
    }
}