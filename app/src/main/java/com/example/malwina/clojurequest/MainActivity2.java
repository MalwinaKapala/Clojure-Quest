package com.example.malwina.clojurequest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by malwina on 08.08.18.
 */



public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button answerButton;
    Button nextButton;
    TextView answerTextView;
    float aNumber;
    int anotherNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerButton = (Button)findViewById(R.id.answerButton);
        answerButton.setOnClickListener(this);
        nextButton = (Button)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(this);

        nextButton.setEnabled(false);

        aNumber = 5.5f;
        anotherNumber = 5;
        aNumber = anotherNumber;
        anotherNumber = (int)aNumber;
    }


    public void onClick(View v) {
//        Log.d("Malwina", "clicked");

        switch (v.getId()) {
            case R.id.answerButton:
                //do nothing
                // do not let user hit buttons more than once (either case)
                nextButton.setEnabled(true);
                answerButton.setEnabled(false);
                answerTextView = (TextView) findViewById(R.id.answerTextView);
                answerTextView.setVisibility(View.VISIBLE);
                break;
            case R.id.nextButton:
//                currentNum = alterNum();
//                myTextView.setText("Current Number: " + String.valueOf(currentNum));
//                // do not let user hit buttons more than once (either case)
                nextButton.setEnabled(false);
                answerButton.setEnabled(false);
                break;
            default:
                break;
//        }
        }
    }
    public void onRadioButtonClicked (View view) {
        RadioButton rb1 = (RadioButton) findViewById(R.id.radio_button_1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radio_button_2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radio_button_3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radio_button_4);

        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){

            case R.id.radio_button_1:
                if(checked)
                    break;

            case R.id.radio_button_2:
                if(checked)
                    break;

            case R.id.radio_button_3:
                if(checked)
                    break;

            case R.id.radio_button_4:
                if(checked)
                    break;
        }
    }


}

