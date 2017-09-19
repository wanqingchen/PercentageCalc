package com.example.wanqingchen.percentagecalc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wanqingchen.percentagecalc.Main2Activity;
import com.example.wanqingchen.percentagecalc.R;

import static android.R.id.message;


public class MainActivity extends AppCompatActivity {

    TextView totalTextView;
    EditText percentageTxt;
    EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // totalTextView = (TextView) findViewById(R.id.totaltextview);
        percentageTxt = (EditText) findViewById(R.id.percentageTxt);
        numberTxt = (EditText) findViewById(R.id.numberTex);

//        Button calcBTN = (Button) findViewById(R.id.calcBTN);
//        calcBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                float percentage = Float.parseFloat(percentageTxt.getText().toString());
//                float dec = percentage/100;
//                float total = dec * Float.parseFloat(numberTxt.getText().toString());
//                totalTextView.setText(Float.toString(total));
//
//            }
//
//
//        });



        Button jumpBTN = (Button) findViewById(R.id.jump);
        jumpBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                float percentage = Float.parseFloat(percentageTxt.getText().toString());
                float dec = percentage/100;
                float total = dec * Float.parseFloat(numberTxt.getText().toString());
                String message = Float.toString(total);

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("message",message);
                startActivity(i);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
