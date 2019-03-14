package com.example.detaillistfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvname, tvdob, tvadd, tvemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvname = findViewById(R.id.tv_name);
        tvdob = findViewById(R.id.tv_year);
        tvadd = findViewById(R.id.tv_address);
        tvemail = findViewById(R.id.tv_email);

        Intent intent = getIntent();
        Human human = (Human)intent.getSerializableExtra("guidulieuquaText");
        tvname.setText(human.getName());
        tvdob.setText(human.getDob());
        tvadd.setText(human.getAddress());
        tvemail.setText(human.getEmail());
    }
}
