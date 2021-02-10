package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Integer> words=new ArrayList<>();

        for(int i=1;i<5;i++){
            Log.v("NumbersActivity", "Index:" + i + " Value:" + words.get(i));
           // words.add(i);
        }

    }
}