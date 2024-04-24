package com.example.to_do_calendar;

import com.example.to_do_calendar.databinding.ActivityInsertInformationBinding;

import android.content.Intent;
import android.os.Bundle;


import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;


public class insert_information extends AppCompatActivity {
    File file = new File("file.txt");
    private ActivityInsertInformationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInsertInformationBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        binding.backButton.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();
        });
        binding.acceptButton.setOnClickListener(v -> {

        });
    }
}