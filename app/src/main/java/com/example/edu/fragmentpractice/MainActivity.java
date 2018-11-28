package com.example.edu.fragmentpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (LinearLayout)findViewById(R.id.button1);
        button2 = (LinearLayout)findViewById(R.id.button2);
        button3 = (LinearLayout)findViewById(R.id.button3);
        button4 = (LinearLayout)findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == button1)
            getFragmentManager().beginTransaction().replace(R.id.main_frame, new MyFragment1()).commit();
        else if(v == button2)
            getFragmentManager().beginTransaction().replace(R.id.main_frame, new MyFragment2()).commit();
        else if(v == button3)
            getFragmentManager().beginTransaction().replace(R.id.main_frame, new MyFragment3()).commit();
        if(v == button4)
            getFragmentManager().beginTransaction().replace(R.id.main_frame, new MyFragment4()).commit();
    }
}
