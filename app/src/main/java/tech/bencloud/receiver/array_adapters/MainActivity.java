package tech.bencloud.receiver.array_adapters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String[] fruit = new String[]{"Apple", "Mango", "Orange", "Pear"};

        // Create an ArrayAdapter that works with objects of type String, and tell it that we're
        // working in this context, we should display our list using the built-in
        // "simple_list_item_1" layout, and here's the array of Strings to put in the list.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, fruit);

        // Create a ListView, assign the adapter and display the ListView!
        ListView lv = new ListView(this);
        lv.setAdapter(adapter);
        setContentView(lv);
    }
}