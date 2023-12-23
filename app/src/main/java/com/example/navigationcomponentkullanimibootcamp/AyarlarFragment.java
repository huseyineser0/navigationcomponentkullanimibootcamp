package com.example.navigationcomponentkullanimibootcamp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimibootcamp.databinding.FragmentAyarlarBinding;

public class AyarlarFragment extends Fragment {

    private FragmentAyarlarBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentAyarlarBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }
}