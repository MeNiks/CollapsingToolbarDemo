package com.niks.collapsingtoolbardemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by niks
 */
public class CollaspingInFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collasping_in_fragment);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        CollaspingInFragment collaspingInFragment=new CollaspingInFragment();
        ft.add(R.id.fragmentlayout, collaspingInFragment,"");
        ft.commit();
    }
}
