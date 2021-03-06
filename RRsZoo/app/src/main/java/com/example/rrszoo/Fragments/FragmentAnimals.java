package com.example.rrszoo.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.example.rrszoo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentAnimals#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentAnimals extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    boolean isEnglish = true;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Spinner spinner;

    public FragmentAnimals() {
        // Required empty public constructor
    }

    public FragmentAnimals(boolean isEnglish) {
        // Required empty public constructor
        this.isEnglish = isEnglish;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentAnimals.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentAnimals newInstance(String param1, String param2) {
        FragmentAnimals fragment = new FragmentAnimals();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(isEnglish ? R.layout.fragment_animals : R.layout.fragment_animals_heb, container, false);
    }
}