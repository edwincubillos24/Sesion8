package com.edwinacubillos.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FlashFragment fragment = new FlashFragment();
        fragmentTransaction.add(android.R.id.content, fragment).commit();

    }

  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.menu_main, menu);
      return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        int id = item.getItemId();

        if (id == R.id.action_flash){
            FlashFragment fragment = new FlashFragment();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();

        }

        if (id == R.id.action_superman){
            SupermanFragment fragment = new SupermanFragment();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();

        }

        return super.onOptionsItemSelected(item);
    }
}
