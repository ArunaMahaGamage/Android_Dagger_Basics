package com.aruna.daggerbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.aruna.daggerbasics.repository.UserRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an instance of the application graph
        ApplicationGraph applicationGraph = DaggerApplicationGraph.create();

        // Grab an instance of UserRepository from the application graph
        UserRepository userRepository = applicationGraph.userRepository();

        UserRepository userRepository2 = applicationGraph.userRepository();

        Log.e("MainActivity : ","" + (userRepository != userRepository2));

        if (userRepository == null) {
            Log.e("MainActivity : ", "userRepository is null");
        } else {
            Log.e("MainActivity : ", "userRepository is not null");
        }
    }
}