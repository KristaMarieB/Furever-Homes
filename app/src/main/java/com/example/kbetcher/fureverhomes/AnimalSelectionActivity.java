package com.example.kbetcher.fureverhomes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnimalSelectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_selection);
    }

    public void onBackClick(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}
