package com.example.a24_tongsynguyen_18078591;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CustomerOrder extends AppCompatActivity {
    ImageView xem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order);

        xem = findViewById(R.id.xembill);
        xem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerOrder.this, DetailActivity1.class);
                startActivity(intent);
            }
        });
    }
}