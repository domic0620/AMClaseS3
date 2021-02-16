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

public class ConfigFragment extends Fragment implements View.OnClickListener {

    private Button mainColorBtn1,mainColorBtn2,mainColorBtn3;
    private Button backColorBtn1,backColorBtn2,backColorBtn3;


    public ConfigFragment() {
        // Required empty public constructor
    }

    public static ConfigFragment newInstance() {
        ConfigFragment fragment = new ConfigFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_config, container, false);
        mainColorBtn1 = root.findViewById(R.id.mainColorBtn1);
        mainColorBtn2 = root.findViewById(R.id.mainColorBtn2);
        mainColorBtn3 = root.findViewById(R.id.mainColorBtn3);
        backColorBtn1 = root.findViewById(R.id.backColorBtn1);
        backColorBtn2 = root.findViewById(R.id.backColorBtn2);
        backColorBtn3 = root.findViewById(R.id.backColorBtn3);

        mainColorBtn1.setOnClickListener(this);
        mainColorBtn2.setOnClickListener(this);
        mainColorBtn3.setOnClickListener(this);
        backColorBtn1.setOnClickListener(this);
        backColorBtn2.setOnClickListener(this);
        backColorBtn3.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mainColorBtn1:
                break;
            case R.id.mainColorBtn2:
                break;
            case R.id.mainColorBtn3:
                break;
            case R.id.backColorBtn1:
                break;
            case R.id.backColorBtn2:
                break;
            case R.id.backColorBtn3:
                break;
        }
    }
}