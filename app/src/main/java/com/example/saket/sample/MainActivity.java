package com.example.saket.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void task(View view)
    {int result=0;
        EditText et1=(EditText)findViewById(R.id.etxt1);
        EditText et2=(EditText)findViewById(R.id.etxt2);

        int num1=Integer.parseInt(et1.getText().toString());
        int num2=Integer.parseInt(et2.getText().toString());


        result=num1+num2;
        RadioButton rb1=(RadioButton)findViewById(R.id.rbtn1);
        RadioButton rb2=(RadioButton)findViewById(R.id.rbtn2);
        if(rb1.isChecked())
        {

        }


        Toast.makeText(getBaseContext(),"sum"+result,Toast.LENGTH_LONG).show();
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }

}
