package com.ashandilya.firebasephoneauth;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText phone, fName,lname,ID;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById(R.id.phoneNo);
        fName = findViewById(R.id.FirstName);
        lname = findViewById(R.id.LastName);
        ID = findViewById(R.id.Id);
        btn = findViewById(R.id.submitBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OtpVerify.class);
                intent.putExtra("phone",phone.getText().toString());
                startActivity(intent);
                SubmitallData();
            }
        });
    }

    private void SubmitallData() {



    }
}
