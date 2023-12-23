package com.example.navigationcomponentkullanimibootcamp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.navigationcomponentkullanimibootcamp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        NavHostFragment navHostFragment1=
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment1);

        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment1.getNavController());
    }
}