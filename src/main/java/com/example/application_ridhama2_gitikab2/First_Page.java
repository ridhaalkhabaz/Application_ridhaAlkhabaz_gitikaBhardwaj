package com.example.application_ridhama2_gitikab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class First_Page extends AppCompatActivity {
    private Button button;
    private Button button2;
    public void go_calendar(View view) {
        Intent changing_pages_for_calendar = new Intent(this, The_Calendar.class);
        startActivity(changing_pages_for_calendar);
    }
    public void go_resources(android.view.View view) {
        Intent changing_pages_for_resources = new Intent(this, Resources.class);
        startActivity(changing_pages_for_resources);
    }

    @Override
    protected void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.calendar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("hello", "onClick: working");
                go_calendar(v);
            }
        });
        button2 = findViewById(R.id.resources);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                go_resources(v);
            }
        });
    }


}
