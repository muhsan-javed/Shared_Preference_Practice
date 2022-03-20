package com.muhsanapps.sharedpreferencedbpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.muhsanapps.sharedpreferencedbpractice.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view -> {
            // code for verification

            SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putBoolean("flag",true);
            editor.apply();

            Intent iHome = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(iHome);
        });


    }
}