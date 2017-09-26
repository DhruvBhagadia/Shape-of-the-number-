package com.example.dell_pc.shapeofthenumber;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;
        boolean isTriangular (int number){
            int x=1;
            int num=1;
            while(num < number){
                x++;
                num = num + x;
            }
            if(num == number)
                return true;
            else
                return false;
        }
        boolean isSquare(int number) {
            double squareroot = Math.sqrt(number);
            if(squareroot == Math.floor(squareroot))
                return true;
            else
                return false;
        }
    }

    public void ClickFunction (View view){
        Number n = new Number();

        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        n.number = Integer.parseInt(numberEditText.getText().toString());
        if ((n.isSquare(n.number) && (n.isTriangular(n.number)))) {
            Toast.makeText(this, "Number is both square as well as triangular", Toast.LENGTH_LONG).show();
        }
        else if ((n.isSquare(n.number))){
            Toast.makeText(this,"It is a square number", Toast.LENGTH_LONG).show();
        }
        else if ((n.isTriangular(n.number))){
            Toast.makeText(this,"It is a Triangular number", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"neither a square nor a triangular number", Toast.LENGTH_LONG).show();
        }
        Log.i("Info","Clicked!");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
