package com.example.mohitpallaptop.letsshareride;

/**
 * Created by Mohitpal laptop on 08-02-2017.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class HomeActivity extends AppCompatActivity {

    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        Fragment ride_frag = new ride_fragment();
        ft.replace(R.id.frame_id ,ride_frag);

        ft.commit();


    }

    public void openprofile(View v)
    {

        FragmentTransaction ft = fm.beginTransaction();
        Fragment cm = new profile_fragment();

        ft.replace(R.id.frame_id ,cm);

        ft.commit();

    }

    public void openride(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment ride_frag = new ride_fragment();
        ft.replace(R.id.frame_id ,ride_frag);

        ft.commit();

    }

    public void opencontact(View v)
    {
        FragmentTransaction ft = fm.beginTransaction();
        Fragment contact_frag = new Contact_fragment();

        ft.replace(R.id.frame_id , contact_frag);


        ft.commit();
    }


    }

