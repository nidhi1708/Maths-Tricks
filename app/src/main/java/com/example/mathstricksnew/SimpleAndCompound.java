package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleAndCompound extends AppCompatActivity {
    EditText ed1 , ed2, ed3,ed4,ed5,ed6;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_and_compound);

        ed1=findViewById(R.id.editTextNumberSigned3);
        ed2=findViewById(R.id.editTextNumberSigned4);
        ed3=findViewById(R.id.editTextNumberSigned5);
        ed4=findViewById(R.id.editTextNumberSigned6);
        ed5=findViewById(R.id.editTextNumberSigned7);
        ed6=findViewById(R.id.editTextNumberSigned8);
        button=findViewById(R.id.button18);
    }

    public void find(View v){
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();
        String s4=ed4.getText().toString();
        String s5=ed5.getText().toString();
        String s6=ed6.getText().toString();
        if(TextUtils.isEmpty(s1)){
                if(TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3) || TextUtils.isEmpty(s5)){
                    Toast.makeText(this, "Enter all other Input Fields", Toast.LENGTH_SHORT).show();
                }else{
                    double n2=Double.parseDouble(s2);
                    double n3=Double.parseDouble(s3);
                    double n5=Double.parseDouble(s5);
                    double ans=(100*n5)/(n2*n3);
                    String s=String.format("%,.2f", ans);
                    ed1.setText(s);
                }
            }
       else if(TextUtils.isEmpty(s2)){
                if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s3) || TextUtils.isEmpty(s5)){
                    Toast.makeText(this, "Enter all other Input Fields", Toast.LENGTH_SHORT).show();
                }else{
                    double n1=Double.parseDouble(s1);
                    double n3=Double.parseDouble(s3);
                    double n5=Double.parseDouble(s5);
                    double ans=(100*n5)/(n1*n3);
                    String s=String.format("%,.2f", ans);
                    ed2.setText(s);
                }
        }

        else if(TextUtils.isEmpty(s3)){
            if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2) || TextUtils.isEmpty(s5)){
                Toast.makeText(this, "Enter all other Input Fields", Toast.LENGTH_SHORT).show();
            }else{
                double n1=Double.parseDouble(s1);
                double n2=Double.parseDouble(s2);
                double n5=Double.parseDouble(s5);
                double ans=(100*n5)/(n1*n2);
                String s=String.format("%,.2f", ans);
                ed3.setText(s);
            }
        }

        else if(TextUtils.isEmpty(s5) && TextUtils.isEmpty(s4)){
            if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s3) || TextUtils.isEmpty(s2)){
                Toast.makeText(this, "Enter all other Input Fields", Toast.LENGTH_SHORT).show();
            }else{
                double n1=Double.parseDouble(s1);
                double n3=Double.parseDouble(s3);
                double n2=Double.parseDouble(s2);
                double ans=(n1*n2*n3)/100;
                String s=String.format("%,.2f", ans);
                ed5.setText(s , TextView.BufferType.EDITABLE);
            }
        }

        else{
            if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s3) || TextUtils.isEmpty(s2)) {
                Toast.makeText(this, "Enter all other Input Fields", Toast.LENGTH_SHORT).show();
            }else{
                double p=Double.parseDouble(s1);
                double t=Double.parseDouble(s3);
                double r=Double.parseDouble(s2);
                double n=Double.parseDouble(s4);
                double a=1+(r/n);
                double b=n*t;
                double po=Math.pow(a , b);
                double ans=p*po;
                String s=String.format("%,.2f", ans);
                ed6.setText(s);
            }
        }
        }
    }
