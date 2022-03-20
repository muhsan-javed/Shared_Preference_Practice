package com.muhsanapps.sharedpreferencedbpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.muhsanapps.sharedpreferencedbpractice.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences preferences = getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();

                editor.putBoolean("flag", false);
                editor.apply();
            }
        });
    }
}