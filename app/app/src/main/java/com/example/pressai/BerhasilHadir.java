package com.example.pressai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationBarView;

public class BerhasilHadir extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil_hadir);
        Button lihat_keadiran_btn = findViewById(R.id.lihat_kehadiran_btn);
        Button kembali_btn = findViewById(R.id.kembali_btn);

        kembali_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layout_dashboard = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(layout_dashboard);
            }
        });

        lihat_keadiran_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layout_dashboard = new Intent(getApplicationContext(), Dashboard.class);
                layout_dashboard.putExtra("selectedItemId",R.id.item_3);
                startActivity(layout_dashboard);
                finish();

            }
        });
    }
}