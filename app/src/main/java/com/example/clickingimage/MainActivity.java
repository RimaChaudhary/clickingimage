package com.example.clickingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView I1,I2;
    TextView Name, Address,Phone,Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1=findViewById(R.id.I1);
        I2=findViewById(R.id.I2);
        Name=findViewById(R.id.Name);
        Address=findViewById(R.id.Address);
        Phone=findViewById(R.id.Phone);
        Email=findViewById(R.id.Email);
    }

    @Override
    public void onClick(View v) {


    }
}
