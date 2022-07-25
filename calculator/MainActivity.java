package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView edt1;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Made by Varshith", Toast.LENGTH_SHORT).show();
        button0 = (Button) findViewById(R.id.Zero);
        button1 = (Button) findViewById(R.id.One);
        button2 = (Button) findViewById(R.id.Two);
        button3 = (Button) findViewById(R.id.Three);
        button4 = (Button) findViewById(R.id.Four);
        button5 = (Button) findViewById(R.id.Five);
        button6 = (Button) findViewById(R.id.Six);
        button7 = (Button) findViewById(R.id.Seven);
        button8 = (Button) findViewById(R.id.Eight);
        button9 = (Button) findViewById(R.id.Nine);
        buttonDot = (Button) findViewById(R.id.Dot);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.Subtraction);
        buttonMul = (Button) findViewById(R.id.Multiply);
        buttonDivision = (Button) findViewById(R.id.Divide);
//        Remainder = (Button) findViewById(R.id.Remainder);
        buttonDel = (Button) findViewById(R.id.delete);
        buttonEqual = (Button) findViewById(R.id.Equal);
        edt1 = (TextView) findViewById(R.id.display);
        //number 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });
        //number 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        //number 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        //number 4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        //number 5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        //number 6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        //number 7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        //number 8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        //number 9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        //number 0
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        //addition
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        //subtraction
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        //multiplication
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        //division
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Division = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        //equal
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition) {
                    edt1.setText(input1 + input2 + "");
                    Toast.makeText(getApplicationContext(),input1 + input2 + "", Toast.LENGTH_SHORT).show();
                    Addition = false;

                }

                if (Subtract) {

                    edt1.setText(input1 - input2 + "");
                    Toast.makeText(getApplicationContext(),input1 - input2 + "", Toast.LENGTH_SHORT).show();
                    Subtract = false;
                }

                if (Multiplication) {
                    edt1.setText(input1 * input2 + "");
                    Toast.makeText(getApplicationContext(),input1 * input2 + "", Toast.LENGTH_SHORT).show();
                    Multiplication = false;
                }

                if (Division) {
                    edt1.setText(input1 / input2 + "");
                    Toast.makeText(getApplicationContext(),input1 / input2 + "", Toast.LENGTH_SHORT).show();
                    Division = false;
                }
//                if (mRemainder) {
//                    edt1.setText(input1 % input2 + "");
//                    mRemainder = false;
//                }
            }
        });


        //Delete button
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        //Decimal
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });







    }
}
