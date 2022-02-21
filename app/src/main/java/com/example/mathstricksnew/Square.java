package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Square extends AppCompatActivity {
    EditText ed1 , ed2, ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        ed1=findViewById(R.id.editTextNumber3);
        ed2=findViewById(R.id.editTextNumber7);
        ed3=findViewById(R.id.editTextNumber8);
    }

    public void find(View v){
        String s1=ed1.getText().toString();

        if(TextUtils.isEmpty(s1)){
                Toast.makeText(this, "Enter the side", Toast.LENGTH_SHORT).show();
            }else {
                double side=Double.parseDouble(s1);
                double p=4*side;
                double a=side*side;
                String s=String.format("%,.2f", p);
                ed2.setText("Perimeter= "+s + " units");
                String s5=String.format("%,.2f", a);
                ed3.setText("Area= "+s5+" sq units");
            }

    }
    public void aside(View v){
        String s3=ed3.getText().toString();
        double a=Double.parseDouble(s3);
        double ans = Math.sqrt(a);
        String s=String.format("%,.2f", ans);
        ed1.setText(s + " units");
    }
    public void pside(View v){
        String s2=ed2.getText().toString();
        double p=Double.parseDouble(s2);
        double ans = p/4;
        String s=String.format("%,.2f", ans);
        ed1.setText(s+" units");
    }
}