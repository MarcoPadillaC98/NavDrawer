package com.example.navdrawer.ui.otraspublicaciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawer.databinding.FragmentOtraspublicacionesBinding;


public class OtrasPublicacionesFragment extends Fragment {

    private FragmentOtraspublicacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        OtrasPublicacionesViewModel otrasPublicacionesViewModel =
                new ViewModelProvider(this).get(OtrasPublicacionesViewModel.class);

        binding = FragmentOtraspublicacionesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        otrasPublicacionesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}