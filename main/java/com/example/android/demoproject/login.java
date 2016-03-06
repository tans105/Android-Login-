package com.example.android.demoproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.demoproject.R.id.pass;

public class login extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "tanmay";
    static final String password = "ssss";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        Button login = (Button) findViewById(R.id.login1);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        EditText passField = (EditText) findViewById(R.id.pass);
        EditText unameField = (EditText) findViewById(R.id.uname);
        TextView t1 = (TextView) findViewById(R.id.wrong);

        if (v.getId() == R.id.login1) {

            if (passField.getText().toString().equals(password) && !unameField.getText().toString().equals("")) {
                Log.i(TAG, findViewById(pass).toString());
                passField.setText("");
                unameField.setText("");
                t1.setText("");
                startActivity(new Intent("android.intent.success"));
            } else if (unameField.getText().toString().equals("")) {


                passField.setText("");
                unameField.setText("");
                t1.setText("enter a username");
                Log.i(TAG, findViewById(pass).toString());
            } else {


                passField.setText("");
                unameField.setText("");
                t1.setText("password incorrect");
                Log.i(TAG, findViewById(pass).toString());
            }


        }
    }
}