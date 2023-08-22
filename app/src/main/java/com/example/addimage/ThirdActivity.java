package com.example.addimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ThirdActivity extends AppCompatActivity {
    ImageView image;
    TextView txtname,txtdate,txtcountry,txtcontact,txtemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent  = getIntent();
        Bundle bundle = intent.getBundleExtra("thongtin");
        mapping();
        String url = bundle.getString("img");
        Picasso.get().load(url).into(image);
        txtname.setText(bundle.getString("hoten"));
        txtdate.setText(bundle.getString("ngaysinh"));
        txtcountry.setText(bundle.getString("quaquan"));
        txtcontact.setText(bundle.getString("sdt"));
        txtemail.setText(bundle.getString("email"));
    }

    private void mapping() {
        image = findViewById(R.id.image);
        txtname = findViewById(R.id.txtname);
        txtdate = findViewById(R.id.txtdate);
        txtcountry = findViewById(R.id.txtquequan);
        txtcontact = findViewById(R.id.txtstd);
        txtemail = findViewById(R.id.txtemail);
    }
}