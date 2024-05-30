package com.example.brickbreaker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {
    TextView tvPoints;
    ImageView ivNewHighest;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        ivNewHighest =findViewById(R.id.ivNewHeighest);
        tvPoints =findViewById(R.id.tvPoints);
        int points=getIntent().getExtras().getInt("points");
        if (points == 320 || points == 400){
            ivNewHighest.setVisibility(View.VISIBLE);
        }
        tvPoints.setText(""+points);
    }
    public void restart(View view){
        GameView gameView = new GameView(this);
        setContentView(gameView);
    }
    public void next(View view){
        NextLevel nextLevel = new NextLevel(this);
        setContentView(nextLevel);
    }
    public void exit(View view){
        finish();
    }
}
