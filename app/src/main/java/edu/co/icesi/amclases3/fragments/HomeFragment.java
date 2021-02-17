package edu.co.icesi.amclases3.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import edu.co.icesi.amclases3.R;
import edu.co.icesi.amclases3.model.User;

public class HomeFragment extends Fragment implements ContentFragment.onUserEditListener{

    //State
    private User user;

    //UI
    private ImageView profileImage;
    private TextView profileName, profileCareer;
    private TextView profileDescription;


    public HomeFragment() {
        // Required empty public constructor
        user = new User();
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

        profileImage.setImageResource(user.getImage());
        profileName.setText(user.getName());
        profileCareer.setText(user.getCareer());
        profileDescription.setText(user.getDescription());


        return root;
    }


    @Override
    public void onImage(int image) {
        user.setImage(image);
    }

    @Override
    public void onPersonalInfo(String name, String career, String description) {
        user.setName(name);
        user.setCareer(career);
        user.setDescription(description);
    }


}