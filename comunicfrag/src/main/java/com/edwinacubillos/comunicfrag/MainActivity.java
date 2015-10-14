package com.edwinacubillos.comunicfrag;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements comunicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        EnvioFragment fragment = new EnvioFragment();
        fragmentTransaction.add(android.R.id.content, fragment).commit();
    }

    @Override
    public void envioDatos(String name, String lastname) {

        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("lastname",lastname);

        ReceptorFragment receptorFragment = new ReceptorFragment();
        receptorFragment.setArguments(args);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(android.R.id.content, receptorFragment).commit();


    }
}
