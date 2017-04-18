package com.chadwiedemann.yourstopcommuter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSavedLocations(View view){

        Log.d("tag 1","go to saved locations");
    }

    public void goToNewLocation(View view){
        Log.d("tag 2","go to new location maker");
        Intent createDestinationMap = new Intent(this, SetDestinationMap.class);
        startActivity(createDestinationMap);

    }
}
