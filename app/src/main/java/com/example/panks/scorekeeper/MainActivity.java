package com.example.panks.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int goal_a = 0;//goal_a variable will keep track on number of points scored by TEAM A
    private int goal_b = 0;//goal_b variable will keep track on number of points scored by TEAM B
    private int foul_a = 0;//foul_a variable will keep track on number of fouls occured by TEAM A
    private int foul_b = 0;//foul_b variable will keep track on number of fouls occured by TEAM B
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //goalA method increment the points by one of TEAM A whenever it is clicked
    public void goalA(View view)
    {
        goal_a += 1;
        displayScore(goal_a,R.id.score_board_A);
    }
    //goalB method increment the points by one of TEAM B whenever it is clicked
    public void goalB(View view)
    {
        goal_b += 1;
        displayScore(goal_b,R.id.score_board_B);
    }
    //foulA method increment foul number by one of TEAM A
    public void foulA(View view)
    {
        foul_a += 1;
        displayFoul(foul_a,R.id.foul_board_A);
    }
    //foulB method increment foul number by one of TEAM B
    public void foulB(View view)
    {
        foul_b += 1;
        displayFoul(foul_b,R.id.foul_board_B);
    }
    //resets all the values i.e. goal_a, goal_b, foul_a, foul_b values
    public void reset(View view)
    {
        goal_a = goal_b = foul_a = foul_b = 0;
        displayScore(goal_a,R.id.score_board_A);
        displayScore(goal_b,R.id.score_board_B);
        displayFoul(foul_a,R.id.foul_board_A);
        displayFoul(foul_b,R.id.foul_board_B);
    }
    //updates the value of score board depending upon current score and corresponding team id
    public void displayScore(int score,int id)
    {
        TextView textView = (TextView) findViewById(id);
        textView.setText(String.valueOf(score));
    }
    //updates the value of foul board depending upon current foul score and corresponding team id
    public void displayFoul(int foul,int id)
    {
        TextView textView = (TextView)findViewById(id);
        textView.setText(String.valueOf(foul));
    }
}
