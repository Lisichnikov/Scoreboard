package com.example.tablo2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "StartActivity";

    private Integer ScoreTeamRussia = 0;
    private Integer ScoreTeamUSA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddPointRussia(View view)
    {
        ScoreTeamRussia++;
        TextView counterView = findViewById(R.id.russia_counter);
        counterView.setText(ScoreTeamRussia.toString());
    }
    public void onClickBtnAddPointUSA(View view)
    {
        ScoreTeamUSA++;
        TextView counterView = findViewById(R.id.usa_counter);
        counterView.setText(ScoreTeamUSA.toString());
    }

    public void Reset(View View) {
        ScoreTeamRussia = 0;
        TextView counterView = findViewById(R.id.russia_counter);
        counterView.setText(ScoreTeamRussia.toString());
        ScoreTeamUSA = 0;
        TextView counterView1 = findViewById(R.id.usa_counter);
        counterView1.setText(ScoreTeamUSA.toString());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("RU", ScoreTeamRussia );
        outState.putInt("USA", ScoreTeamUSA );
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("RU")) {
            ScoreTeamRussia = savedInstanceState.getInt("RU");
            TextView counterView = findViewById(R.id.russia_counter);
            counterView.setText(ScoreTeamRussia.toString());
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("USA")) {
            ScoreTeamUSA = savedInstanceState.getInt("USA");
            TextView counterView = findViewById(R.id.usa_counter);
            counterView.setText(ScoreTeamUSA.toString());
        }
    }
}