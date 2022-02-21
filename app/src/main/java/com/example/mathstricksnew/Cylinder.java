package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cylinder extends AppCompatActivity {
    private EditText ed1 , ed2 , ed4 , ed5 , ed6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        ed1=findViewById(R.id.editTextNumberDecimal39);
        ed2=findViewById(R.id.editTextNumberDecimal40);
        ed4=findViewById(R.id.editTextNumberDecimal41);
        ed5=findViewById(R.id.editTextNumberDecimal42);
        ed6=findViewById(R.id.editTextNumberDecimal43);
    }

    public void find(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter all the requires fields", Toast.LENGTH_SHORT).show();
        }else{
            double r=Double.parseDouble(s1);
            double h=Double.parseDouble(s2);

            double vol=Math.PI * r* r*h;
            String s4=String.format("%,.2f", vol);
            ed4.setText("Vol= "+s4 +" cube units");

            double tsa=2 * Math.PI*r *(r+h);
            String s5=String.format("%,.2f", tsa);
            ed5.setText("TSA= "+s5+ " sq units");

            double csa = 2*Math.PI*r * h;
            String s6=String.format("%,.2f", csa);
            ed6.setText("CSA= "+s6+" sq units");
        }
    }
}