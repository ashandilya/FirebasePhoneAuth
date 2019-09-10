package com.ashandilya.firebasephoneauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class OtpVerify extends AppCompatActivity {

    private EditText otp;
    Button OtpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify);

        otp = findViewById(R.id.enterOtp);
        OtpBtn = findViewById(R.id.OtpButton);

    }
}
