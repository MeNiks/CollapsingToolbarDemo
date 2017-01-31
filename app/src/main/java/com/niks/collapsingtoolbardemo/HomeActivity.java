package com.niks.collapsingtoolbardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void clickCollapseImage(View view) {
        Intent intent=new Intent(HomeActivity.this,CollaspingImageActivity.class);
        startActivity(intent);
    }

    public void clickCollapseFABButton(View view) {
        Intent intent=new Intent(HomeActivity.this,CollaspingFabButtonActivity.class);
        startActivity(intent);
    }

    public void clickCollapseFABButtonInFragment(View view) {
        Intent intent=new Intent(HomeActivity.this,CollaspingInFragmentActivity.class);
        startActivity(intent);
    }
}
