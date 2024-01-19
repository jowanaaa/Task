package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    CardView cardView;
    ImageButton imgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox1);
        cardView = findViewById(R.id.clean);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cardView.setVisibility(View.VISIBLE);
                }
                else
                    cardView.setVisibility(View.GONE);
            }
        });

        imgButton = (ImageButton) findViewById(R.id.add);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent (MainActivity.this, GSTask.class);
                startActivities(intentLoadNewActivity);
            }

            private void startActivities(Intent intentLoadNewActivity) {
            }
        });


    }
}