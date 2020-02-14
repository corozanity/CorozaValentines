package com.example.corozavalentines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String num1 = "0";
    String num2 = "2";
    String num3 = "1";
    String num4 = "4";
    EditText pass1;
    EditText pass2;
    EditText pass3;
    EditText pass4;
    ImageView logo;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pass1 = findViewById(R.id.pass1);
        pass2 = findViewById(R.id.pass2);
        pass3 = findViewById(R.id.pass3);
        pass4 = findViewById(R.id.pass4);
        login = findViewById(R.id.login);
        logo = findViewById(R.id.logo);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.equals(pass1.getText().toString()) && num2.equals(pass2.getText().toString()) && num3.equals(pass3.getText().toString()) && num4.equals(pass4.getText().toString())) {

                    Toast.makeText(getApplicationContext(), "Passcode correct.", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, MainMenu.class);
                    startActivity(intent);

                } else
                    Toast.makeText(getApplicationContext(), "Password incorrect.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}