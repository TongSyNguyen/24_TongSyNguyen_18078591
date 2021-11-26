package com.example.a24_tongsynguyen_18078591;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity1 extends AppCompatActivity {
    ImageView tinhtien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);

        tinhtien = findViewById(R.id.tinhtien);
        tinhtien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity1.this, DetailActivity2.class);
                startActivity(intent);
            }
        });


    }
}