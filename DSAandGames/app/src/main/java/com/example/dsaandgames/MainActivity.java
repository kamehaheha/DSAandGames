package com.example.dsaandgames;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker possibilities;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        webView = (WebView) findViewById(R.id.webView);
        String[] possibilitiesString = {"Playing Cards" , "Cards Against Humanity" , "Krunker" , "Secret Hitler" ,"Skribbl"};
        possibilities.setDisplayedValues(possibilitiesString);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitiesString.length - 1);

    }

    public void navigate(View v) {
        int choice = possibilities.getValue();
        if (choice == 0) {
            // load the android.html page stored in the assets of the application
            Intent gotopart = new Intent();
            gotopart.setClass(this , zero.class);

            startActivity(gotopart);


        }
        else if(choice == 1) {
            Intent gotopart = new Intent();
            gotopart.setClass(this , first.class);

            startActivity(gotopart);
        }
        else if(choice == 2)
        {
            Intent gotopart = new Intent();
            gotopart.setClass(this , second.class);

            startActivity(gotopart);

        }
        else if(choice == 3)
        {
            Intent gotopart = new Intent();
            gotopart.setClass(this , third.class);

            startActivity(gotopart);

        }
        else if(choice == 4)
        {
            Intent gotopart = new Intent();
            gotopart.setClass(this , fourth.class);

            startActivity(gotopart);

        }

    }
}