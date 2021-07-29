package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaration of objects used in the app
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bequal,bplus,bminus,bdiv,bmul,bclear,bdot;
    TextView input,output;
    float val1,val2;
    boolean addition,subtract,multi,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"");
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(input.getText()+"");
                addition=true;
                input.setText(null);

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(input.getText()+"");
                subtract=true;
                input.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(input.getText()+"");
                multi=true;
                input.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Float.parseFloat(input.getText()+"");
               division=true;
                input.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(input.getText()+"");
                if(addition==true){
                    output.setText(val1+val2+"");
                    addition=false;
                }
                else if(subtract==true){
                    output.setText(val1-val2+"");
                    subtract=false;
                }
                else if(multi==true){
                    output.setText(val1*val2+"");
                    multi=false;
                }
                else {
                    if(val2!=0){
                        output.setText(val1/val2+"");
                        division=false;
                    }
                    else {
                        output.setText("Error");
                        division=false;
                    }
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
                output.setText(null);
            }
        });


    }
    //connection
    void setView(){
        b0=(Button) findViewById(R.id.button0);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        bequal=(Button) findViewById(R.id.equals);
        bplus=(Button) findViewById(R.id.plus);
        bminus=(Button) findViewById(R.id.sub);
        bdiv=(Button) findViewById(R.id.div);
        bmul=(Button) findViewById(R.id.mul);
        bclear=(Button) findViewById(R.id.clear);
        bdot=(Button) findViewById(R.id.dot);
        input= (TextView) findViewById(R.id.input);
        output= (TextView) findViewById(R.id.output);



    }
}
//s1-declaration of object
//s2-connect button to button id
//s3-defining action
