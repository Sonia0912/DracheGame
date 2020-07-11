package com.sonia.drachegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button map = (Button) findViewById(R.id.mapButton);
        final Button items = (Button) findViewById(R.id.itemsButton);
        final Button settings = (Button) findViewById(R.id.settingsButton);
        FXMLLoader loader = new FXMLLoader();

        // initialize the background image
        ImageView background;
        background = (ImageView) findViewById(R.id.backgroundImageView);
        background.setImageResource(R.drawable.drachenschanze);
        // initialize the avatar image
        ImageView avatar;
        avatar = (ImageView) findViewById(R.id.avatarImageView);
        avatar.setImageResource(R.drawable.drache);
        // initialize the comic
        TextView comic;
        comic = (TextView) findViewById(R.id.comicTextView);
        comic.setText("Hello hatersssss");

        // what happens when you click on Map
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.map);

                // Set the person into the controller.
                MapController controller = loader.getController();
                // controller.setDialogStage(dialogStage);

                /* submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    } */
            }
        });

        // what happens when you click on Items
        items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.items);
            }
        });

        // what happens when you click on Settings
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.settings);
            }
        });

        // go to the next comic (button or clicking on the text?)

    }




}
