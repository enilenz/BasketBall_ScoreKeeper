
 package com.example.android.matchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
     int scoreA = 0;
     int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threeA (View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
     public void twoA (View view){
         scoreA+=2;
         displayForTeamA(scoreA);
     }
     public void freeThrow_A(View view){
         scoreA+=1;
         displayForTeamA(scoreA);
     }
     public void displayForTeamA(int score){
         TextView scoreView = (TextView) findViewById(R.id.team_a_score);
         scoreView.setText(String.valueOf(score));
     }
     //TEAM B
     public void threeB (View view){
         scoreB+=3;
         displayForTeamB(scoreB);
     }
     public void twoB (View view){
         scoreB+=2;
         displayForTeamB(scoreB);
     }
     public void freeThrow_B(View view){
         scoreB+=1;
         displayForTeamB(scoreB);
     }
     public void displayForTeamB(int score){
         TextView scoreView = (TextView) findViewById(R.id.team_b_score);
         scoreView.setText(String.valueOf(score));
     }
     //reset
     public void reset (View view){
         displayForTeamA(0);
         displayForTeamB(0);
     }
}
