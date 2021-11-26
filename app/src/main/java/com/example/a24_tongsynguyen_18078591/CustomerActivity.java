package com.example.a24_tongsynguyen_18078591;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CustomerActivity extends AppCompatActivity {
    ImageView ban1,ban2,ban3,ban4,ban5,ban6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        ban1 = findViewById(R.id.ban1);
        ban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerActivity.this, CustomerOrder.class);
                startActivity(intent);
            }
        });
        ban2 = findViewById(R.id.ban2);
        ban3 = findViewById(R.id.ban3);
        ban4 = findViewById(R.id.ban4);
        ban5 = findViewById(R.id.ban5);
        ban6 = findViewById(R.id.ban6);

    }
}