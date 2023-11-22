package com.example.navdrawer.ui.pubReporte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.navdrawer.databinding.FragmentPubreporteBinding;

public class PubReporteFragment extends Fragment {

    private FragmentPubreporteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PubReporteViewModel pubReporteViewModel =
                new ViewModelProvider(this).get(PubReporteViewModel.class);

        binding = FragmentPubreporteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        pubReporteViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}