package com.example.sms_manager;

import androidx.appcompat.app.AppCompatActivity;
import android.telephony.SmsManager;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);


    }
    public void onSend(View view){
        String phoneNumber = et1.getText().toString();
        SmsManager sms = SmsManager.getDefault();
        String msg = et2.getText().toString();
        sms.sendTextMessage(phoneNumber, null, msg, null, null);
    }
}