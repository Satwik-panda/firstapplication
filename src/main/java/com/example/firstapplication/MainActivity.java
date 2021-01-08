package com.example.firstapplication;
       
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_add,btn_sub,btn_mul,btn_div,btn_pcnt,btn_eql,btn_del,btn_ac,btn_point;
    EditText editText;

    float num1,num2;
    boolean add,sub,mul,div,pcnt,del,ac;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
                setContentView(R.layout.relative_layout);

        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn_add=(Button) findViewById(R.id.btnadd);
        btn_sub=(Button) findViewById(R.id.btnsub);
        btn_mul=(Button) findViewById(R.id.btnmul);
        btn_div=(Button) findViewById(R.id.btndiv);
        btn_del=(Button) findViewById(R.id.btndel);
        btn_ac=(Button) findViewById(R.id.btnAC);
        btn_pcnt=(Button) findViewById(R.id.btn_percentage);
        btn_point=(Button) findViewById(R.id.btnpt);
        btn_eql=(Button) findViewById(R.id.btn_equal);
        editText=(EditText) findViewById(R.id.et1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+"9");
            }
        });

        btn_point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText()+".");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

//functionality
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                num1=Float.parseFloat(editText.getText()+"");
                add=true;
                editText.setText(null);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Float.parseFloat(editText.getText()+"");
                sub=true;
                editText.setText(null);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Float.parseFloat(editText.getText()+"");
                mul=true;
                editText.setText(null);            }
        });

        btn_div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Float.parseFloat(editText.getText()+"");
                div=true;
                editText.setText(null);            }
        });

        btn_pcnt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1=Float.parseFloat(editText.getText()+"");
                pcnt=true;
                editText.setText(null);            }
        });


        btn_eql.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                num2=Float.parseFloat(editText.getText()+"");
                if(add==true)
                {
                    editText.setText(num1+num2+"");
                    add=false;
                }
                if(sub==true)
                {
                    editText.setText(num1-num2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    editText.setText(num1*num2+"");
                    mul=false;
                }
                if(div==true)
                {
                    editText.setText(num1/num2+"");
                    div=false;
                }
                if(pcnt==true)
                {
                    editText.setText(num1%num2+"");
                    pcnt=false;
                }


            }
        });

    }
    }




