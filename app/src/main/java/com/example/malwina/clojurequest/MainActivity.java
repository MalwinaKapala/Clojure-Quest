package com.example.malwina.clojurequest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button answerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerButton = (Button)findViewById(R.id.answerButton);

        answerButton.setOnClickListener(this);
    }


    public void onClick(View v) {
        Log.d("Malwina", "clicked");
//        switch (v.getId()) {
//            case R.id.num_confirmation:
//                //do nothing
//                // do not let user hit buttons more than once (either case)
//                nextButton.setEnabled(false);
//                answerButton.setEnabled(false);
//                break;
//            case R.id.swap_button:
//                currentNum = alterNum();
//                myTextView.setText("Current Number: " + String.valueOf(currentNum));
//                // do not let user hit buttons more than once (either case)
//                nextButton.setEnabled(false);
//                answerButton.setEnabled(false);
//                break;
//            default:
//                break;
////        }
//    }
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
