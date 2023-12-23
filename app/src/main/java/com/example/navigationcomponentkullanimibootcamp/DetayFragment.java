package com.example.navigationcomponentkullanimibootcamp;

import static android.app.ProgressDialog.show;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimibootcamp.databinding.FragmentDetayBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.Set;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                binding=FragmentDetayBinding.inflate(inflater,container,false);

                DetayFragmentArgs bundle=DetayFragmentArgs.fromBundle(getArguments());
                String gelenAd=bundle.getAd();
                int gelenYas=bundle.getYas();
                float gelenBoy=bundle.getBoy();
                Boolean gelenBekar=bundle.getBekar();

                Urunler gelenUrun=bundle.getUrun();

                binding.textViewBilgi.setText(gelenAd+"-"+gelenBoy+"-"+gelenYas+"-"+gelenBekar+"-"+gelenUrun.getId()+"-"+gelenUrun.getAd());

        OnBackPressedCallback geriTusu=new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.textViewBilgi,"Geri dönmek istiyor musunu ?",Snackbar.LENGTH_SHORT)
                        .setAction("EVET",v -> {
                            setEnabled(false);
                            requireActivity().getOnBackPressedDispatcher().onBackPressed();
                }).show();

            }
        };
                requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),geriTusu);
                return binding.getRoot();
    }
}