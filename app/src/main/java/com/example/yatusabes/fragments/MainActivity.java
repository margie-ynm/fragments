package com.example.yatusabes.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OneInputFragment inputFragment = new OneInputFragment();
        OneOutputFragment outputFragment = new OneOutputFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.replace(R.id.output_frame, outputFragment);
        transaction.replace(R.id.input_frame, inputFragment);
        transaction.commit();
    }

    public void CalculateVolumeOfSphere(View view) {


        String outputMessage = "The volume of a sphere with radius " + rad + " is " + volume;
        TextView outputText = (TextView) findViewById(R.id.output_volume);
        outputText.setText(outputMessage);
    }
}
