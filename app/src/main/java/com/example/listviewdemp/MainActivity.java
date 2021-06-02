package com.example.listviewdemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.time.Duration;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);
        ArrayList<String> familyMem = new ArrayList<>();
        familyMem.add("Divya");
        familyMem.add("Devesh");
        familyMem.add("Vaanya");
        familyMem.add("Madhu");
        familyMem.add("Virendar");
        familyMem.add("Kamla");
        familyMem.add("Neha");
        familyMem.add("Nevaan");
        familyMem.add("Puneet");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, familyMem);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("Info", familyMem.get(position));

                Toast.makeText(getApplicationContext(), "Family member clicked " + familyMem.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}