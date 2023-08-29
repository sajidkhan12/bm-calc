package com.example.bmical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton b1,b2,b3,b4,b5,b6,b7,b8,b9,zero,backspace,point,clear,multiply,divide,plus,minus,equals;
    EditText editText1;
    double first;
    double second;
    double answer;
    double loop;
    String operations;
    double soop=1;

    //





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        backspace=findViewById(R.id.backspace);
        //point=findViewById(R.id.point);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multi);
        divide=findViewById(R.id.divide);

        equals=findViewById(R.id.equals);
        clear=findViewById(R.id.clear);

        editText1=findViewById(R.id.edt1);

       backspace.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String backspace=null;
               if (editText1.getText().length()>0){
                   StringBuilder stringBuilder=new StringBuilder(editText1.getText());
                   stringBuilder.deleteCharAt(editText1.getText().length()-1);
                   backspace=stringBuilder.toString();
                   editText1.setText(backspace);
                   if (backspace==null){
                       editText1.setText(null);

                   }
               }
           }
       });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
               text=editText1.getText().toString()+b1.getText();
               editText1.setText(text);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b2.getText();
                editText1.setText(text);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b3.getText();
                editText1.setText(text);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b4.getText();
                editText1.setText(text);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b5.getText();
                editText1.setText(text);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b6.getText();
                editText1.setText(text);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b7.getText();
                editText1.setText(text);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b8.getText();
                editText1.setText(text);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+b9.getText();
                editText1.setText(text);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text=editText1.getText().toString()+zero.getText();
                editText1.setText(text);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                primary=editText1.getText().toString();
                first=Double.parseDouble(primary);
                loop=loop+first;
                editText1.setText("");
                operations="+";

            }

        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operations.equals("+")) {
                    String secondary;
                    String ans;
                    secondary = editText1.getText().toString();
                    second = Double.parseDouble(secondary);
                    answer = loop + second;
                    ans = String.valueOf(answer);
                    editText1.setText(ans);
                    loop=0;//to add from the result set
                    answer=0;//to add from the result set

                } else if (operations.equals("-")) {
                    String secondary;
                    String ans;
                    secondary = editText1.getText().toString();
                    second = Double.parseDouble(secondary);
                    //loop add kiya
                    //Main logic part is here.
                    if (loop>0){//this is for the 2 number subtractions
                        answer = loop-second;
                        ans = String.valueOf(answer);
                        editText1.setText(ans);
                        loop=0;
                        answer=0;

                    }
                    else if (loop<0) {//this is for the 3 numbers subtractions
                        loop=-loop;
                        answer =  loop-second;
                        ans = String.valueOf(answer);
                        editText1.setText(ans);
                        loop=0;
                       answer=0;

                    }

                    //this is the original line


                   // answer = loop - second;
                   // ans = String.valueOf(answer);
                   // editText1.setText(ans);
                   // loop=0;
                   // answer=0;


                } else if (operations.equals("*")) {
                    String secondary;
                    String ans;
                    secondary = editText1.getText().toString();
                    second = Double.parseDouble(secondary);
                    answer = soop * second;
                    ans = String.valueOf(answer);
                    editText1.setText(ans);
                    soop=1;

                } else if (operations.equals("/")) {
                    String secondary;
                    String ans;
                    secondary = editText1.getText().toString();
                    second = Double.parseDouble(secondary);
                     answer =first/second;
                    ans = String.valueOf(answer);
                    editText1.setText(ans);



                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                primary=editText1.getText().toString();
                first=Double.parseDouble(primary);
                //this for the loop to subtract the series of numbers.
                loop=-first-loop;

                editText1.setText("");
                operations="-";
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String primary;
                primary=editText1.getText().toString();
                first=Double.parseDouble(primary);
                soop=first*soop;
                editText1.setText("");
                operations="*";


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                 loop=1;
                primary=editText1.getText().toString();
                first=Double.parseDouble(primary);


                editText1.setText("");
                operations="/";


            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(null);
                loop=0;
                answer=0;
                soop=1;

            }
        });
    }
}