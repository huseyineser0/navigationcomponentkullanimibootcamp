package com.example.navigationcomponentkullanimibootcamp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimibootcamp.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                binding=FragmentAnasayfaBinding.inflate(inflater, container, false);

                binding.buttonDetay.setOnClickListener(view -> {
                    //binding.textViewBaslik.setText("Merhaba");
                   // Navigation.findNavController(binding.buttonDetay).navigate(R.id.detayGecis); böylede olur aşadaki gibi de
                    Urunler urun=new Urunler(100,"TV");
                    AnasayfaFragmentDirections.DetayGecis gecis=AnasayfaFragmentDirections.detayGecis(urun);
                    gecis.setAd("Hüseyin");
                    gecis.setYas(22);
                    gecis.setBoy(1.78f);
                    gecis.setBekar(true);

                    Navigation.findNavController(view).navigate(gecis);
                });

                binding.buttonGoster.setOnClickListener(view->{
                    Navigation.findNavController(view).navigate(R.id.bottomSheetGecis);
                });

                return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Yaşam döngüsü","onCreate");
        // uygulama ilk çalıştığında çalışır
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Yaşam döngüsü","onResume");
        //sayfa göründüğünde çalışır
        //sayfa dönüldüğünde
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Yaşam döngüsü","onPause");
        //sayfa göründmez olduğunda
        //sayfadan ayrıldığımızda
    }
}