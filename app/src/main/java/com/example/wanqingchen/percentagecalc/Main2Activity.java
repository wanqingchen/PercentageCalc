package com.example.wanqingchen.percentagecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wanqingchen.percentagecalc.R;


public class Main2Activity extends AppCompatActivity {

    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        String mes = bundle.getString("message");
        result = (TextView) findViewById(R.id.result);
        result.setText(mes);

    }
}
