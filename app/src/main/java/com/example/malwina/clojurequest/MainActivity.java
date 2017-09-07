package com.example.malwina.clojurequest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked (View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radio_button_1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radio_button_2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radio_button_3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radio_button_4);

        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
    }
}}
