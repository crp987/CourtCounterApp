package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(0);
        displayScoreB(0);
    }

    public void displayScoreA(int score){
        TextView scoreText=(TextView) findViewById(R.id.score_team_a);
        scoreText.setText(String.valueOf(score));
    }

    public void displayScoreB(int score){
        TextView scoreText=(TextView) findViewById(R.id.score_team_b);
        scoreText.setText(String.valueOf(score));
    }

    public void incrementABy3(View view){
        scoreA+=3;
        displayScoreA(scoreA);
    }

    public void incrementABy2(View view){
        scoreA+=2;
        displayScoreA(scoreA);
    }

    public void freeThrowA(View view){
        scoreA+=1;
        displayScoreA(scoreA);
    }

    public void incrementBBy3(View view){
        scoreB+=3;
        displayScoreB(scoreB);
    }

    public void incrementBBy2(View view){
        scoreB+=2;
        displayScoreB(scoreB);
    }

    public void freeThrowB(View view){
        scoreB+=1;
        displayScoreB(scoreB);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }
}
