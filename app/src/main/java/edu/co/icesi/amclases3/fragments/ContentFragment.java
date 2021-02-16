package edu.co.icesi.amclases3.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import edu.co.icesi.amclases3.R;

public class ContentFragment extends Fragment implements View.OnClickListener{

    //Views
    private EditText nameET, careerET, descriptionET;
    private ImageButton profilePhotoBtn1, profilePhotoBtn2, profilePhotoBtn3, profilePhotoBtn4;
    private Button editInfoBtn;

    public ContentFragment() {
        // Required empty public constructor
    }

    public static ContentFragment newInstance() {
        ContentFragment fragment = new ContentFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_content, container, false);

        //Referenciar views
        nameET = root.findViewById(R.id.nameET);
        careerET = root.findViewById(R.id.careerET);
        descriptionET = root.findViewById(R.id.descriptionET);
        profilePhotoBtn1 = root.findViewById(R.id.profilePhotoBtn1);
        profilePhotoBtn2 = root.findViewById(R.id.profilePhotoBtn2);
        profilePhotoBtn3 = root.findViewById(R.id.profilePhotoBtn3);
        profilePhotoBtn4 = root.findViewById(R.id.profilePhotoBtn4);
        editInfoBtn = root.findViewById(R.id.editInfoBtn);

        profilePhotoBtn1.setOnClickListener(this);
        profilePhotoBtn2.setOnClickListener(this);
        profilePhotoBtn3.setOnClickListener(this);
        profilePhotoBtn4.setOnClickListener(this);
        editInfoBtn.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        //La variable v que recibe este método es el view al que se le hace click
        switch (v.getId()){
            case R.id.profilePhotoBtn1:
                break;
            case R.id.profilePhotoBtn2:
                break;
            case R.id.profilePhotoBtn3:
                break;
            case R.id.profilePhotoBtn4:
                break;
            case R.id.editInfoBtn:
                break;
        }
    }
}