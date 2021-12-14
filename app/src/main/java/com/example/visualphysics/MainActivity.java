package com.example.visualphysics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView questionTextView;
    private GridLayout answersLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionTextView = findViewById(R.id.question);
        answersLayout = findViewById(R.id.buttonsContainer);
        setQuestion();
        setAnswers();
    }

    private void setAnswers() {
        answersLayout.removeAllViews();
        String [] answers = new String[]{"иногда честный", "иногда нечестный", "всегда честный", "всегда нечестный"};
        for (String answer:answers) {
            Button button = new Button(this);
            ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(24, 24, 24, 24);
            button.setLayoutParams((params));
            button.setText(answer);
            answersLayout.addView(button);
        }
    }

    private void setQuestion() {
        questionTextView.setText("Ты честный человек?");

    }
}