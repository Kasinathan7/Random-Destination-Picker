
package com.example.mini46;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

TextView destinationText, featuresText;

Button pickButton, visitButton;

String[][] destinations = {

{"Taj Mahal, Agra", "Iconic symbol of love", "27.1751", "78.0421"},

{"Qutub Minar, Delhi", "Historic monument", "28.5245", "77.1855"},

{"Gateway of India, Mumbai", "Historic gateway", "18.9219", "72.8347"},

{"Amer Fort, Jaipur", "Majestic fort", "26.9855", "75.8510"},

{"Varanasi, Uttar Pradesh", "Spiritual capital of India", "25.3176", "82.9739"},

{"Meenakshi Temple, Madurai", "Famous temple", "9.9195", "78.1198"},

{"Charminar, Hyderabad", "Iconic landmark", "17.3616", "78.4747"},

{"Tirupati, Andhra Pradesh", "Famous temple town", "13.6288", "79.4197"},

{"Chichen Itza, Tamil Nadu", "Ancient architectural marvel", "9.9200", "78.1261"},



{"Kochi, Kerala", "Historical city", "9.9312", "76.2673"},

{"Rishikesh, Uttarakhand", "Yoga and adventure sports", "30.0850", "78.2680"},

{"Bengaluru, Karnataka", "IT hub and parks", "12.9716", "77.5946"},

{"Khajuraho, Madhya Pradesh", "Famous temples", "24.8556", "79.9190"},

{"Sundarbans, West Bengal", "World's largest delta", "21.9497", "88.2042"},

{"Pondicherry", "French colonial city", "11.9416", "79.8083"},

{"Mysore Palace, Karnataka", "Palace of the Wodeyars", "12.3050", "76.6550"},

{"Rajasthan Desert", "Golden sand dunes", "27.0238", "71.8991"},

{"Khajuraho, Madhya Pradesh", "UNESCO World Heritage Site", "24.8556", "79.9190"},

{"Andaman Islands", "Beautiful beaches and corals", "12.2590", "92.7364"},

{"Munnar, Kerala", "Tea plantations", "10.0881", "77.0600"},

{"Ooty, Tamil Nadu", "Hill station and lakes", "11.4107", "76.6925"},

{"Ladakh, Jammu & Kashmir", "High-altitude desert", "34.1526", "77.5770"},

{"Coorg, Karnataka", "Coffee plantations", "12.3370", "75.8043"},

{"Bodh Gaya, Bihar", "Buddhist pilgrimage site", "24.6957", "84.9916"},

{"Kumarakom, Kerala", "Backwaters and bird sanctuary", "9.6003", "76.3915"},

{"Hampi, Karnataka", "Ruins of Vijayanagar empire", "15.3350", "76.4600"},

{"Kanha National Park, Madhya Pradesh", "Tiger reserve", "22.4136", "80.5057"}

};

int currentIndex = -1;

@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);



setContentView(R.layout.activity_main);

destinationText = findViewById(R.id.destinationText);

featuresText = findViewById(R.id.featuresText);

pickButton = findViewById(R.id.pickButton);

visitButton = findViewById(R.id.visitButton);

pickButton.setOnClickListener(view -> {

Random random = new Random();

currentIndex = random.nextInt(destinations.length);

destinationText.setText(destinations[currentIndex][0]);

featuresText.setText("Famous for: " + destinations[currentIndex][1]);

});

visitButton.setOnClickListener(view -> {

if (currentIndex != -1) {

Intent intent = new Intent(MainActivity.this, MapActivity.class);

intent.putExtra("e1", destinations[currentIndex][2]); // lat

intent.putExtra("e2", destinations[currentIndex][3]); // long

startActivity(intent);

}

});

}

}
