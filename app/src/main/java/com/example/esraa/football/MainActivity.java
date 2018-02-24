package com.example.esraa.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView team_A_goals, team_B_goals, team_B_fouls, team_A_fouls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_A_goals = (TextView) findViewById(R.id.goal_of_A);
        team_A_fouls = (TextView) findViewById(R.id.fouls_of_A);
        team_B_goals = (TextView) findViewById(R.id.goal_of_B);
        team_B_fouls = (TextView) findViewById(R.id.fouls_of_B);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("Team_A_goals", team_A_goals.getText().toString());
        savedInstanceState.putString("Team_B_goals", team_B_goals.getText().toString());
        savedInstanceState.putString("Team_A_fouls", team_A_fouls.getText().toString());
        savedInstanceState.putString("Team_B_fouls", team_B_fouls.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        team_A_goals.setText(savedInstanceState.getString("Team_A_goals"));
        team_B_goals.setText(savedInstanceState.getString("Team_B_goals"));
        team_A_fouls.setText(savedInstanceState.getString("Team_A_fouls"));
        team_B_fouls.setText(savedInstanceState.getString("Team_B_fouls"));
    }


    // increasing the number of goals for Team A by 1
    int Goals_OF_A = 0;

    public void Team_A_Goals(View v) {
        Goals_OF_A++;
        team_A_goals.setText("" + Goals_OF_A);
    }

    // increasing the number of fouls for Team A by 1
    int Fouls_of_A = 0;

    public void Team_A_Fouls(View v) {
        Fouls_of_A++;
        team_A_fouls.setText("" + Fouls_of_A);
    }

    // increasing the number of goals for Team A by 1
    int Goals_OF_B = 0;

    public void Team_B_Goals(View view) {
        Goals_OF_B++;
        team_B_goals.setText("" + Goals_OF_B);
    }

    // increasing the number of fouls for Team B by 1
    int Fouls_of_B = 0;

    public void Team_B_Fouls(View v) {
        Fouls_of_B++;
        team_B_fouls.setText("" + Fouls_of_B);
    }

    //reset values
    public void reset(View v) {
        Goals_OF_A = 0;
        Goals_OF_B = 0;
        Fouls_of_A = 0;
        Fouls_of_B = 0;
        team_A_goals.setText("" + 0);
        team_A_fouls.setText("" + 0);
        team_B_goals.setText("" + 0);
        team_B_fouls.setText("" + 0);
    }
}
