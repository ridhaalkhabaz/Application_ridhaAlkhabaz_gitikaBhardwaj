package com.example.application_ridhama2_gitikab2;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Resources extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_main_3);

        button = findViewById(R.id.the_uiuc_resources);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                the_counceilling_center_website(v);
            }
        });
        button2 = findViewById(R.id.the_suicide_hotline);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                the_suicide_hotline(v);
            }
        });
        button3 = findViewById(R.id.the_wellbeing);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wellbeing_website(v);
            }
        });
    }
    public void the_counceilling_center_website(View view) {
        Intent browsing_uiuc_mental_health = new Intent(Intent.ACTION_VIEW, Uri.parse("https://counselingcenter.illinois.edu/node/4"));
        startActivity(browsing_uiuc_mental_health);
    }
    public void the_suicide_hotline(View view) {
        Intent The_suicide_hotLine = new Intent(Intent.ACTION_VIEW, Uri.parse("https://suicidepreventionlifeline.org/"));
        startActivity(The_suicide_hotLine);
    }
    public void wellbeing_website(View view) {
        Intent the_well_beiong_website = new Intent(Intent.ACTION_VIEW, Uri.parse("https://healthywa.wa.gov.au/Articles/F_I/Good-mental-health-and-wellbeing"));
        startActivity(the_well_beiong_website);
    }
}
