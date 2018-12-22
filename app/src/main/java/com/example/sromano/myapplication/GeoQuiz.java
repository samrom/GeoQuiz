package com.example.sromano.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GeoQuiz extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_quiz);

        mTrueButton = (Button) findViewById(R.id.true_btn);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoQuiz.this, R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });


        mFalseButton = (Button) findViewById(R.id.false_btn);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoQuiz.this, R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();

            }
        });

    }

}
