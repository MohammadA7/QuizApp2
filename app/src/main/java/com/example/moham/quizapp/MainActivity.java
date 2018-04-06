package com.example.moham.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button trueButton;
    Button falseButton;

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;

    EditText editText;
    String answer4;
    Game game;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueButton = findViewById(R.id.first_qustion_True);
        falseButton = findViewById(R.id.first_qustion_False);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        editText = findViewById(R.id.editText);
        answer4 = "@string/forth_qustion_answer";

        game = new Game();

    }
    public void checkAnswer1(View v){
        if( v == falseButton) {
            game.increaseScore();
            setContentView(R.layout.question2);
        }
        else if(v == trueButton) {
            setContentView(R.layout.question2);
        }
    }
    public void checkAnswer2(View v){
        if( checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked() && checkBox4.isChecked())
            game.increaseScore();

            setContentView(R.layout.question3);
    }
    public void checkAnswer3(View v){
        if(radioButton2.isChecked())
            game.increaseScore();

        setContentView(R.layout.question4);
    }
    public void checkAnswer4(View v){
        if( editText.getText().toString().equalsIgnoreCase("@string/forth_qustion_answer") )
            game.increaseScore();

           Toast.makeText(this, "Your Score is " + game.getScore(), Toast.LENGTH_LONG);

    }
}
