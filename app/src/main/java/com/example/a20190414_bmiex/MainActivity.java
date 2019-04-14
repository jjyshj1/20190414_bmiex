package com.example.a20190414_bmiex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tallEdt;
    EditText weightEdt;
    Button bmiBtn;
    EditText bmiEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tallEdt = findViewById(R.id.tallEdt);
        weightEdt = findViewById(R.id.weightEdt);
        bmiBtn = findViewById(R.id.bmiBtn);
        bmiEdt = findViewById(R.id.bmiEdt);

        bmiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float tallInput = Float.parseFloat(tallEdt.getText().toString())/100;
                float weightInput = Float.parseFloat(weightEdt.getText().toString());
                float bmi = weightInput/(tallInput*tallInput);
                String strbmi = String.valueOf(bmi);
                bmiEdt.setText(strbmi);


                Intent intent =new Intent(MainActivity.this,Bmi_Result.class);
                intent.putExtra("bmi",bmi);
                startActivity(intent);



            }
        });

    }
}
