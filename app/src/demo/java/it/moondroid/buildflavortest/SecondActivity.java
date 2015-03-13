package it.moondroid.buildflavortest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

import it.moondroid.buildflavorstest.R;

public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Demo version: doesn't inflate the menu;
        return true;
    }

}
