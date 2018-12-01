package com.ahmadsisfo.droid_windi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView kompetensi = (CardView) findViewById(R.id.kompetensi);
        CardView pendahuluan = (CardView) findViewById(R.id.pendahuluan);
        CardView materi = (CardView) findViewById(R.id.materi);
        CardView soal = (CardView) findViewById(R.id.soal);
        //CardView about = (CardView) findViewById(R.id.about);

        //about.setOnClickListener(this);
        soal.setOnClickListener(this);
        materi.setOnClickListener(this);
        pendahuluan.setOnClickListener(this);
        kompetensi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.kompetensi:
                Toast.makeText(this, "kompetensi", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("name", "Kompetensi Dasar");
                intent.putExtra("file", "file:///android_asset/kompetensi.html");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.startActivity(intent);
                break;
            case R.id.pendahuluan:
                Toast.makeText(this, "pendahuluan", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("name", "Pendahuluan");
                intent.putExtra("file", "file:///android_asset/pendahuluan.html");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.startActivity(intent);
                break;
            case R.id.materi:
                Toast.makeText(this, "Materi", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, MateriActivity.class);
                intent.putExtra("name", "Materi");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.startActivity(intent);
                break;
            case R.id.soal:
                Toast.makeText(this, "Soal", Toast.LENGTH_SHORT).show();

                intent = new Intent(this, SoalActivity.class);
                intent.putExtra("name", "Soal Latihan");
                intent.putExtra("thumbnail", R.drawable.background_android);
                intent.putExtra("tipe", "pencernaan");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.startActivity(intent);
                break;
            /*case R.id.about:
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("name", "About");
                intent.putExtra("file", "file:///android_asset/about.html");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                this.startActivity(intent);
                break;*/
        }
    }
}
