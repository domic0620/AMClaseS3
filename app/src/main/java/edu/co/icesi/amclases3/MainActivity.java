package edu.co.icesi.amclases3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import edu.co.icesi.amclases3.fragments.ConfigFragment;
import edu.co.icesi.amclases3.fragments.ContentFragment;
import edu.co.icesi.amclases3.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout container;
    private BottomNavigationView navigator;
    private Toolbar toolbar;

    //Fragments
    private HomeFragment homeFragment;
    private ContentFragment contentFragment;
    private ConfigFragment configFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciar
        toolbar = findViewById(R.id.toolbar);
        container = findViewById(R.id.container);
        navigator = findViewById(R.id.navigator);

        homeFragment = HomeFragment.newInstance();
        contentFragment = ContentFragment.newInstance();
        configFragment = ConfigFragment.newInstance();

        //Configurar la barra superior
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        //Acción del bottom nav bar
        navigator.setOnNavigationItemSelectedListener(
                option -> {
                    switch (option.getItemId()) {
                        case R.id.home:
                            showFragment(homeFragment);
                            break;

                        case R.id.content:
                            showFragment(contentFragment);
                            break;

                        case R.id.config:
                            showFragment(configFragment);
                            break;
                    }
                    return true;
                }
        );

        //Inicialmente mostrar la homeFragment
        showFragment(homeFragment);
    }

    public void showFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }
}