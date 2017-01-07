package com.example.student.db010703;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radioGroup);

    }
    public void click1(View v)
    {
       switch(rg.getCheckedRadioButtonId())
       {
           case R.id.radioButton:
               Log.d("RB", "1");
               break;
           case R.id.radioButton2:
               Log.d("RB", "2");
               break;
       }
    }
}
