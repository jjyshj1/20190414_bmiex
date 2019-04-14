package com.example.a20190414_bmiex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Bmi_Result extends AppCompatActivity {

    EditText bmiresultEdt;
    EditText resultEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__result);

        bmiresultEdt = findViewById(R.id.bmiresultEdt);
        resultEdt = findViewById(R.id.resultEdt);

        float bmi = getIntent().getFloatExtra("bmi",0);
        bmiresultEdt.setText(String.valueOf(bmi));

        if (bmi<18.5) {
            resultEdt.setText("저체중");
        }
        else if(bmi>=18.5 && bmi<23){
            resultEdt.setText("정상");
        }
        else if(bmi>=23 && bmi<25){
            resultEdt.setText("과체중");
        }
        else if(bmi>=25 && bmi<30){
            resultEdt.setText("비만");
        }
        else if(bmi>=30){
            resultEdt.setText("고도비만");
        }
    }


}
