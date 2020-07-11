package com.sonia.drachegame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MapController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        final Button rewe = (Button) findViewById(R.id.reweButton);
        final Button redHeart = (Button) findViewById(R.id.redHeartButton);
        final Button schanze = (Button) findViewById(R.id.schanzeButton);

        // what happens when you click on rewe
        rewe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

        // what happens when you click on redHeart
        redHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

        // what happens when you click on schanze
        schanze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });

    }

}
