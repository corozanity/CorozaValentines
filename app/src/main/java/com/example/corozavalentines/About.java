package com.example.corozavalentines;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    ImageView imageView;
    TextView info;
    TextView student;
    TextView name;
    TextView course;
    TextView skills;
    CheckBox java;
    CheckBox mobile;
    CheckBox bball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        imageView = findViewById(R.id.imageView);
        info = findViewById(R.id.info);
        student = findViewById(R.id.student);
        name = findViewById(R.id.name);
        course = findViewById(R.id.course);
        skills = findViewById(R.id.skills);
        java = findViewById(R.id.java);
        mobile = findViewById(R.id.mobile);
        bball = findViewById(R.id.bball);

    }
}
