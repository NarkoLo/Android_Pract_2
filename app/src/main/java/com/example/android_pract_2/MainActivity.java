package com.example.android_pract_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.dr_livsy);
        imageView.setImageResource(R.drawable.beer);

        EditText emailField = findViewById(R.id.editText_email);
        emailField.setText(R.string.password);

        EditText passwordField = findViewById(R.id.editText_password);
        passwordField.setText(R.string.password);

        Button button = findViewById(R.id.button_login);
        button.setOnClickListener(view -> {
            Log.i("Message", "Signing in");

        });
    }
}