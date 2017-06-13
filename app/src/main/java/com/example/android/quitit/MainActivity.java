package com.example.android.quitit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newEntry = (Button) findViewById(R.id.new_entry_button);
        Button allEntries = (Button) findViewById(R.id.all_entries_button);

        newEntry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NewEntryActivity.class);
                startActivity(i);
            }
        });

        allEntries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AllEntries.class);
                startActivity(i);
            }
        });


    }



    public void newEntryMethod(View view)
    {
        Intent i = new Intent(MainActivity.this, NewEntryActivity.class);
        startActivity(i);
    }
    public void viewAllEntriesMethod(View view)
    {
        Intent i = new Intent(MainActivity.this, EntriesListAdapter.class);
        startActivity(i);
    }

}
