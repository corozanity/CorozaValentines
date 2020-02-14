package com.example.corozavalentines;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Greetings extends AppCompatActivity {

    TextView greet1;
    TextView greet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greet);


        greet1 = findViewById(R.id.greet1);
        greet2 = findViewById(R.id.greet2);


    }
}
