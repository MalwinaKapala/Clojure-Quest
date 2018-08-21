package com.example.malwina.clojurequest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button answerButton;
    Button nextButton;
    TextView answerTextView;
    float aNumber;
    int anotherNumber;
    TextView beforeTextView;
    TextView afterTextView;
    RadioButton answear1;
    RadioButton answear2;
    RadioButton answear3;
    RadioButton answear4;
    TextView correctAnswearTextView;

    List<QuestionCard> questionCards = new ArrayList<>();
    List<RadioButton> radioButtons = new ArrayList<>();

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



        beforeTextView = (TextView)findViewById(R.id.questionTextView1);
        afterTextView = (TextView) findViewById(R.id.questionTextView2);
        answear1 = (RadioButton)findViewById(R.id.radio_button_1);
        answear2 = (RadioButton)findViewById(R.id.radio_button_2);
        answear3 = (RadioButton)findViewById(R.id.radio_button_3);
        answear4 = (RadioButton)findViewById(R.id.radio_button_4);
        correctAnswearTextView = (TextView)findViewById(R.id.answerTextView);

//        radioButtons.add(new RadioButton("(def foo\"foo 1\")", ":foo 1", "(str foo", "keyword foo", "name foo", "type foo", ":foo1"));

        questionCards.add(new QuestionCard("(def foo \"foo1\")", ":foo1", "(str foo)", "keyword foo", "name foo", "type foo", ":foo1"));
        questionCards.add(new QuestionCard("(def foo \"foo 2\")", ":foo 2", "(str foo)", "keyword foo", "name foo", "type foo", ":foo2"));
        questionCards.add(new QuestionCard("(def foo \"foo 3\")", ":foo 3", "(str foo)", "keyword foo", "name foo", "type foo", ":foo3"));
        questionCards.add(new QuestionCard("(def foo \"foo 4\")", ":foo 4", "(str foo)", "keyword foo", "name foo", "type foo", ":foo4"));
        questionCards.add(new QuestionCard("(def foo \"foo 5\")", ":foo 5", "(str foo)", "keyword foo", "name foo", "type foo", ":foo5"));

        QuestionCard currentCard = questionCards.get(4);

        Log.d("MALWINA", "onCreate:======================================================== ");
        beforeTextView.setText(currentCard.before);
        afterTextView.setText(currentCard.after);
        answear1.setText(currentCard.answear1);
        answear2.setText(currentCard.answear2);
        answear3.setText(currentCard.answear3);
        answear4.setText(currentCard.answear4);
        correctAnswearTextView.setText(currentCard.correctAnswear);





//        actualQuestionNumber = 0;

            Log.d("malwina", questionCards.toString());
//
//        String beforeText = currentCard.before;
//        beforeTextView.setText(beforeText);
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
                Intent intent2 = new Intent(this, MainActivity2.class);
                startActivity(intent2);
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
