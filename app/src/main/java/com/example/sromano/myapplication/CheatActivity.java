package com.example.sromano.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CheatActivity extends AppCompatActivity {

    private Button showAnswer;

    private static final String EXTRA_ANSWER_IS_TRUE =
            "com.example.sromano.myapplication.answer_is_true";

    private boolean mAnswerIsTrue;
    private TextView mAnswerTV;

    /**
     * Method allows to retrieve intent extras without having GeoQuiz know the details of
     * CheatActivity.
     * @param packageContext
     * @param answerIsTrue if the user selected True Button
     * @return intent
     */
    public static Intent newIntent(Context packageContext, boolean answerIsTrue){
        Intent intent = new Intent(packageContext, CheatActivity.class);
        intent.putExtra(EXTRA_ANSWER_IS_TRUE, answerIsTrue);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTV = (TextView) findViewById(R.id.answer_text_view);

        showAnswer = (Button) findViewById(R.id.show_answer_button);
        showAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mAnswerIsTrue){
                    mAnswerTV.setText(R.string.true_button);
                }
                else{
                    mAnswerTV.setText(R.string.false_button);
                }

                Toast.makeText(CheatActivity.this, "Cheating is wrong!!",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
}
