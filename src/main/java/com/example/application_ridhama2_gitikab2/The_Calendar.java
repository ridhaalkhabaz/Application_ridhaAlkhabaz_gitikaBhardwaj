package com.example.application_ridhama2_gitikab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class The_Calendar extends AppCompatActivity {
    private RequestQueue mQueue;

    private ImageButton button;
    public void MainActivity_3() {
        Intent changing_pages_for_resources = new Intent(this, The_Calendar.class);
        startActivity(changing_pages_for_resources);
    }
    @Override
    protected void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_main_2);
        TextView k = findViewById(R.id.the_date);
        k.setVisibility(View.VISIBLE);
        mQueue = Volley.newRequestQueue(this);
        jsonParse();
    }
    public void jsonParse() {
        final TextView k = findViewById(R.id.the_date);
        String url = "http://calapi.inadiutorium.cz/api/v0/en/calendars/general-en/today";
        JsonObjectRequest jsonobject = new JsonObjectRequest(Request.Method.GET,url , null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            k.setText(response.getString("date"));
                            k.setVisibility(View.VISIBLE);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();

            }
        });
        mQueue.add(jsonobject);
    }

}
