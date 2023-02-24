package com.example.android_pract_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.android_pract_2.databinding.AuthorizationBinding;

public class Authorization extends AppCompatActivity {

    private AuthorizationBinding binding;
    ImageView imageView;
    EditText emailField;
    EditText passwordField;
    private static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AuthorizationBinding.inflate(getLayoutInflater());
        binding.getRoot();

        imageView = binding.drLivsy;
        imageView.setImageResource(R.drawable.rom_and_death);

        emailField = binding.editTextEmail;
        emailField.setHint(R.string.email);

        passwordField = binding.editTextPassword;
        passwordField.setHint(R.string.password);

        Button button = binding.buttonLogin;
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserInfo.class);
            intent.putExtra("email", emailField.getText().toString());
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            if (data != null) {
                emailField.setText(data.getStringExtra("email"));
            }
        }
    }
}