
package com.example.mini46;

import android.os.Bundle;

import android.webkit.WebView;

import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

WebView w1;

String lat, long1;

@Override



protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_map);

lat = getIntent().getStringExtra("e1");

long1 = getIntent().getStringExtra("e2");

w1 = findViewById(R.id.w1);

w1.setWebViewClient(new WebViewClient());

w1.getSettings().setJavaScriptEnabled(true);

String url = "https://www.google.com/maps/search/?api=1&query=" + lat + "," + long1;

w1.loadUrl(url);

}

}

