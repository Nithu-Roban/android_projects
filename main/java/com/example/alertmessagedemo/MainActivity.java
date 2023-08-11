package com.example.alertmessagedemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity  extends AppCompatActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickMe(View view){
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are you sure");
//        Toast.makeText(this, "alert message appeared", Toast.LENGTH_SHORT).show();
        obj.setCancelable(true);
        obj.setPositiveButton(android.R.string.ok, this);
        obj.setNegativeButton(android.R.string.cancel, this);
//        obj.show();
        AlertDialog d = obj.create();
        d.show();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if(i == -1){
            finish();
        }
        else{
            dialogInterface.cancel();
        }
    }
    public void clickMe2(View view){
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
       obj.setMessage("Are you sure?").setCancelable(true).setPositiveButton("yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               finish();
           }
       }) .setNegativeButton("No", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.cancel();
           }
       });
       AlertDialog d = obj.create();
       d.show();
    }
}