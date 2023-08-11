package com.example.activityswitching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showSum(View view){
        EditText e1 = (EditText) findViewById(R.id.t1);
        EditText e2 = (EditText) findViewById(R.id.t2);

        Intent obj = new Intent("act.second");

        obj.putExtra("num1", e1.getText().toString());
        obj.putExtra("num2", e2.getText().toString());
//        startActivity(obj);
        startActivityForResult(obj,1);
    }
    @Override
    protected void onActivityResult(int rq,int rc,Intent data){
        super.onActivityResult(rq,rc, data);
        EditText e;
        e = (EditText)findViewById(R.id.e);
        e.setText(data.getData().toString());
    }

}