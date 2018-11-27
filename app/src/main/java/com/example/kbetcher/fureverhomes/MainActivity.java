package com.example.kbetcher.fureverhomes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renderSpinner();
    }

    public void renderSpinner(){
        ArrayList<String> locationsArray = new ArrayList<>();
        locationsArray.add("Pierce County");
        locationsArray.add("King County");
        locationsArray.add("Thurston County");

        // get spinner from page
        Spinner locationsSpinner = findViewById(R.id.locationSpinner);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, locationsArray);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        locationsSpinner.setAdapter(dataAdapter);

        location = (String) locationsSpinner.getSelectedItem();

    }

    public void onGoClick(View v){
        startActivity(new Intent(this, AnimalSelectionActivity.class));

    }



}
