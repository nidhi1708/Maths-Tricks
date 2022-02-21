package com.example.mathstricksnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Table extends AppCompatActivity {
    private EditText c , d;
    private TextView textViewTable;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        c=findViewById(R.id.editTextNumberSigned);
        d=findViewById(R.id.editTextNumberSigned2);
        textViewTable=findViewById(R.id.textView3);
        button=findViewById(R.id.button);
    }

    public void table(View v){
        StringBuilder sb=new StringBuilder();
        String s1=c.getText().toString();
        String s2=d.getText().toString();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)){
            Toast.makeText(this, "Enter the required fields", Toast.LENGTH_SHORT).show();
        }else {
            int n = Integer.parseInt(s1);
            int m = Integer.parseInt(s2);
            for (int i = 1; i <= m; i++) {
                int mul = n * i;
                sb.append(n + " x " + i + " = " + mul + "\n");
            }
            textViewTable.setMovementMethod(new ScrollingMovementMethod());
            textViewTable.setText(sb);
        }
    }
}