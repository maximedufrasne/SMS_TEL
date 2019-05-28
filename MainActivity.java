package com.ipi.sms_tel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonOpenSms = findViewById(R.id.openSms);
        buttonOpenSms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSms();
            }
        });

        final Button buttonOpenCall = findViewById(R.id.openCall);
        buttonOpenCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openCall();
            }
        });
    }

    private void openSms(){
        Intent smsIntent = new Intent(Intent.ACTION_SEND);
        smsIntent.putExtra("address", "123456789");
        smsIntent.putExtra("sms_body","Message");
        startActivity(smsIntent);
    }

    private void openCall(){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(callIntent);
    }
}
