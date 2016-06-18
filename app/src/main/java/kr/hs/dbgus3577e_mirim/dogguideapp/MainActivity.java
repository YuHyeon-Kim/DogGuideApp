package kr.hs.dbgus3577e_mirim.dogguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button but1, but2, but3, but4, but5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        startActivity(new Intent(this, SplashActivity.class));

        setContentView(R.layout.activity_main);


        // *** 버튼 1 ***
        but1 = (Button)findViewById(R.id.but_1);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 수행 할 기능 소스
            }
        });

        // *** 버튼 2 ***
        but1 = (Button)findViewById(R.id.but_1);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 수행 할 기능 소스
            }
        });

        // *** 버튼 3 ***
        but1 = (Button)findViewById(R.id.but_1);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 수행 할 기능 소스
            }
        });

        // *** 버튼 4 ***
        but1 = (Button)findViewById(R.id.but_1);
        but1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 수행 할 기능 소스
            }
        });

        // *** 버튼 5 ***
        but5 = (Button)findViewById(R.id.but_5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
                startActivity(intent);

            }
        });
    }
}
