package com.example.android.quitit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ayush vaid on 12-06-2017.
 */
public class NewEntryActivity  extends AppCompatActivity {

    /*this is where the code for adding the data to the DATABASE will go */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_entry);
    }
}
