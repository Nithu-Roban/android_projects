package com.example.activityswitching;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bb = getIntent().getExtras();
        String s1,s2;

        s1 = bb.getString("num1");
        s2 = bb.getString("num2");

        int a,b;
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        int c = a  +b;
        Intent res = new Intent();
        res.setData(Uri.parse("" + c));
        setResult(RESULT_OK,res);
        finish();
    }


}
