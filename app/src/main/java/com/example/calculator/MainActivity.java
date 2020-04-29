package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 = 0, input2 = 0;
    boolean multiplication, division, subtraction, addition, remainder, decimal;
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine,
            buttonZero, buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision, buttonEquals,buttonDelete,buttonDot, buttonRemainder ;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Using find view by id method to find all of the buttons and needed components
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonZero = findViewById(R.id.buttonZero);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonAddition = findViewById(R.id.buttonAddition);
        buttonSubtraction = findViewById(R.id.buttonSubtraction);
        buttonEquals = findViewById(R.id.buttonEquals);
        resultView = findViewById(R.id.result_View);
        buttonDot = findViewById(R.id.buttonDot);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonRemainder = findViewById(R.id.buttonRemainder);



        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "1" );

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "2");

            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "3");

            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "9");
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText() + "3");
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultView.getText().length() != 0){
                    input1 = Float.parseFloat(resultView.getText().toString());

                    addition = true;
                    decimal = false;
                    resultView.setText(null);

                }



            }
        });

        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultView.getText().length() != 0){
                    input1 = Float.parseFloat(resultView.getText() + " ");
                    subtraction = true;
                    decimal = false;
                    resultView.setText(null);

                }

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultView.getText().length() != 0){
                    input1 = Float.parseFloat(resultView.getText() + " ");
                    division = true;
                    decimal = false;
                    resultView.setText(null);

                }

            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultView.getText().length() != 0){
                    input1 = Float.parseFloat(resultView.getText() + " ");
                    multiplication = true;
                    decimal = false;
                    resultView.setText(null);

                }

            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonRemainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultView.getText().length() != 0){
                    input1 = Float.parseFloat(resultView.getText() + " ");
                    remainder = true;
                    decimal = false;
                    resultView.setText(null);

                }

            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (addition || subtraction || multiplication || division || remainder) {
                    input2 = Float.parseFloat(resultView.getText().toString());
                }

                if (addition) {

                    resultView.setText(input1 + input2 + "");
                    addition = false;
                }

                if (subtraction) {

                    resultView.setText(input1 - input2 + "");
                    subtraction = false;
                }

                if (multiplication) {
                    resultView.setText(input1 * input2 + "");
                    multiplication = false;
                }

                if (division) {
                    resultView.setText(input1 / input2 + "");
                    division = false;
                }
                if (remainder) {
                    resultView.setText(input1 % input2 + "");
                    remainder = false;
                }
            }


        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(" ");
                input1 = 0.0;
                input2 = 0.0;
            }
        });


    }
}
