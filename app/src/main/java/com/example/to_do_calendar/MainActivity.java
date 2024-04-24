package com.example.to_do_calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.Instant;
import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);





        Button exit_button = findViewById(R.id.exit_button);
        Button go_button = findViewById(R.id.go_button);
        Button show_button = findViewById(R.id.show_button);
    }
    public void ExitFun(View v){
        finish();
    }

    public void Go(View v){
        Intent i = new Intent(this, insert_information.class);
        startActivity(i);

    }
    public void Show(View v){
        Intent i = new Intent(this, show_do.class);
        startActivity(i);

    }
}