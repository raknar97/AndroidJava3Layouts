package com.example.a3layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moveLayouts(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.tableLayout:
                i=new Intent(this,TableLayout.class);
                startActivity(i);
                break;
            case R.id.linearLayout:
                i=new Intent(this,LinearActivity.class);
                startActivity(i);
                break;
        }


    }
}
