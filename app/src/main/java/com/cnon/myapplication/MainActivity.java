package com.cnon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity implements subtractInterface, addInterface
    , divideInterface , multiplyInterface
{

/*
While you can extend only one class in java, you can implement as many interfaces as you want.
If you want to use a body method in an interface, you must add the static statement to the definition of your method.
 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity ma = new MainActivity();

        Log.e("Subtract", subtractInterface.subtract(3, 5)+"");
        Log.e("Add", addInterface.add(3, 5)+"");
        Log.e("Divide", divideInterface.divide(30, 5)+"");
        Log.e("Multiply", multiplyInterface.multiply(30, 5)+"");

    }
}