package com.example.a211b350_button_text_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public void load(View view){
        Button button=findViewById(R.id.button);
        TextView textview=findViewById(R.id.textview);
        if (button.getText()==textview.getText()){
            button.setText("Button");
        } else {
            button.setText(textview.getText().toString());
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}