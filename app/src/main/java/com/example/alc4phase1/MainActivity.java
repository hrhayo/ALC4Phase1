package com.example.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt1 = findViewById(R.id.btnAbout);
        Button butt2 = findViewById(R.id.btnProfile);

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,actProfile.class);
                startActivity(int1);


            }
        });

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://andela.com/alc/";
                Intent int2 = new Intent(Intent.ACTION_VIEW);
                int2.setData(Uri.parse(url));
                startActivity(int2);
            }
        });


    }
}
