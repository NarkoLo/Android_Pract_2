package com.example.android_pract_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.android_pract_2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        ImageView imageView = binding.drLivsy;
        imageView.setImageResource(R.drawable.rom_and_death);

        EditText emailField = binding.editTextEmail;
        emailField.setText(R.string.password);

        EditText passwordField = binding.editTextPassword;
        passwordField.setText(R.string.password);

        Button button = binding.buttonLogin;
        button.setOnClickListener(view -> {
            Log.i("Message", "Signing in");

        });
    }
}