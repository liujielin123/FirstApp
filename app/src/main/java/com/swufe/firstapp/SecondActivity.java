package com.swufe.firstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView score;
    TextView scoreA;
    TextView scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        score=findViewById(R.id.score);
        scoreA=findViewById(R.id.scoreA);
        scoreB=findViewById(R.id.scoreB);
    }

    public void btnAdd1(View v) {
        public void btnAddA1 (View v){
            showScore(1, scoreA);
        }
        public void btnAdd2 (View v){
            showScore(2);
            public void btnAddA2 (View v){
                showScore(2, scoreA);
            }
            public void btnAdd3 (View v){
                showScore(3);
                public void btnAddA3 (View v){
                    showScore(3, scoreA);
                }
                public void btnAddB1 (View v){
                    showScore(1, scoreB);
                }
                public void btnAddB2 (View v){
                    showScore(2, scoreB);
                }
                public void btnAddB3 (View v){
                    showScore(3, scoreB);
                }
                public void btnReset (View v){
                    score.setText("0");
                    scoreA.setText("0");
                    scoreB.setText("0");
                }
               public void showScore ( int inc){
                    private void showScore ( int inc, TextView score){
                        Log.i("show", "inc=" + inc);
                        String oldScore = (String) score.getText();
                        score.setText("" + (Integer.valueOf(oldScore) + inc));
                    }
                }