package com.kelth.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Demo ListView using adapter
 */
public class MainActivity extends AppCompatActivity {

    String [] names = { "John", "Peter", "Ali", "Steven", "Kelvin" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.item, // resource xml for individual item in list view
                R.id.textView, // textView id in resource xml
                names // string array of names
        );

        // Create listView programmatically OR
        /*
        ListView listView = new ListView(this);
        setContentView(listView);*/
        // add listView in resource
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);

        // Bind listView to adapter
        listView.setAdapter(adapter);
    }
}
