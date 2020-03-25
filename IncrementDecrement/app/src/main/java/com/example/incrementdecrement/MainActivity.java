package com.example.incrementdecrement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int id=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void decreaseInteger(View view)
    {
        id = id-1;
        display(id);
    }

    public void increaseInteger(View view)
    {
        id = id+1;
        display(id);
    }
    private void display(int number)
    {
        TextView displayInteger = (TextView) findViewById(R.id.integer_number);
        displayInteger.setText(""+number);
    }
}
