package edu.co.icesi.amclases3.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import edu.co.icesi.amclases3.R;

public class HomeFragment extends Fragment {

    private ImageView profileImage;
    private TextView profileName, profileCareer;
    private TextView profileDescription;


    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        profileImage = root.findViewById(R.id.profileImage);
        profileName = root.findViewById(R.id.profileName);
        profileCareer = root.findViewById(R.id.profileCareer);
        profileDescription = root.findViewById(R.id.profileDescription);

        return root;
    }
}