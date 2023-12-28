package com.example.thirdapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer fOperant, sOperant, solution;

    private Boolean isOperationCLick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        textView = findViewById(R.id.text_view);


    }
    public void onNumberclick(View view){
        String num = ((MaterialButton) view).getText().toString();
        if (view.getId() == R.id.btn_clear){
            textView.setText("0");
        } else if (textView.getText().toString().equals("0")) {
            textView.setText(num);
        } else if (isOperationCLick) {

        } else{
            textView.append(num);
        }
        isOperationCLick = false;
    }

    public void onOperationClick(View view) {
        if (view.getId() == R.id.btn_plus){
            fOperant = Integer.valueOf(textView.getText().toString());
            textView.setText("");
        }
        isOperationCLick = true;
    }
}