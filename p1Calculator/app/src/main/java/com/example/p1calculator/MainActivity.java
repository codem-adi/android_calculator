package com.example.p1calculator;

//importing all the required classes
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    //declaring the variables
    private double num1, num2, answer;
    private char op;
    private boolean hasDot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //dicleration of all the button and referencing them to respective id

        final Button btnOne = (Button) findViewById(R.id.btnOne);
        final Button btnTwo = (Button) findViewById(R.id.btnTwo);
        final Button btnThree = (Button) findViewById(R.id.btnThree);
        final Button btnFour = (Button) findViewById(R.id.btnFour);
        final Button btnFive = (Button) findViewById(R.id.btnFive);
        final Button btnSix = (Button) findViewById(R.id.btnSix);
        final Button btnSeven = (Button) findViewById(R.id.btnSeven);
        final Button btnEight = (Button) findViewById(R.id.btnEight);
        final Button btnNine = (Button) findViewById(R.id.btnNine);
        final Button btnZero = (Button) findViewById(R.id.btnZero);
        final Button btnAdd = (Button) findViewById(R.id.btnAdd);
        final Button btnSub = (Button) findViewById(R.id.btnSub);
        final Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        final Button btnDivide = (Button) findViewById(R.id.btnDivide);
        final Button btnDot = (Button) findViewById(R.id.btnDot);
        final Button btnEqual = (Button) findViewById(R.id.btnEqual);
        final Button btnClear = (Button) findViewById(R.id.btnClear);
        final TextView txtDisplay = (TextView) findViewById(R.id.txtDisplay);

    //defining the task for the button's when they get clicked
        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.append("0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //if Dot(.) is pressed then set hasDot to true to restrict
                if(!hasDot) {
                    txtDisplay.append(".");
                    hasDot = true;
                }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '+';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '-';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '*';
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in the next operand.
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num1 = Double.parseDouble(txtDisplay.getText().toString());
                op = '/';
                txtDisplay.setText("");
                hasDot = false;
            }
        });


        // dicleration of the arithmetic operations
        btnEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                num2 = Double.parseDouble(txtDisplay.getText().toString());
                switch (op)
                {
                    case '+':
                        answer = num1 + num2;
                        break;
                    case '-':
                        answer = num1 - num2;
                        break;
                    case '*':
                        answer = num1 * num2;
                        break;
                    case '/':
                        answer = num1 / num2;
                        break;
                    default:
                        break;
                }
                DecimalFormat d = new DecimalFormat();
                String ans = d.format(answer);
                txtDisplay.setText(ans);
                hasDot = false; //set hasDot to false to use in new calculation.
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                txtDisplay.setText("");
                hasDot = false; //set hasDot to false to use in new calculation.
            }
        });
    }
}
