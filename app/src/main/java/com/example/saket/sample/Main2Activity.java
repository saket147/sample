package com.example.saket.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void click(View v)
    {
        TextView tv1=(TextView)findViewById(R.id.etxt3);
        Button btn=(Button)findViewById(R.id.b1);
        String s1=btn.getText().toString();
    Button b=(Button)v;


        if(b.getText().equals("good"))
        {
            tv1.setText("good morning");
        }

    }
}
