package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OnClickListener for Number activity************************************************
        //find view that shows numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        //set a clicklisteneron that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(i);

            }
        });

        //OnClickListener for Family activity************************************************
        //find view that shows family category
        TextView family = (TextView)findViewById(R.id.family);

        //set a clicklisteneron that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(i);

            }
        });




        //OnClickListener for Colors activity************************************************
        //find view that shows color category
        TextView colors = (TextView)findViewById(R.id.colors);

        //set a clicklisteneron that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(i);

            }
        });




        //OnClickListener for Phrases activity************************************************
        //find view that shows numbers category
        TextView phrases = (TextView)findViewById(R.id.phrases);

        //set a clicklisteneron that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(i);

            }
        });



    }

}
