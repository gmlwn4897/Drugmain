package com.example.drugapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
        );
    }
}
