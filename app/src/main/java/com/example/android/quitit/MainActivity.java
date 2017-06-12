package com.example.android.quitit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newEntryMethod()
    {
        Intent i = new Intent(MainActivity.this, NewEntryActivity.class);
        startActivity(i);
    }
    public void viewAllEntriesMethod()
    {
        Intent i = new Intent(MainActivity.this, EntriesListAdapter.class);
        startActivity(i);
    }
}
