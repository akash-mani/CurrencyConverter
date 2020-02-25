package com.example.akash.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertFunc(View view){
        Log.i("info", "works");
        EditText amount = (EditText) findViewById(R.id.editText);
        double gbp = Double.parseDouble(amount.getText().toString());
        double usd = gbp * 1.3;
        String str_usd = String.format("%.2f", usd);
        Log.i("amount", str_usd);
        Toast.makeText(this, "amount is "+str_usd, Toast.LENGTH_SHORT).show();

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.pic2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}