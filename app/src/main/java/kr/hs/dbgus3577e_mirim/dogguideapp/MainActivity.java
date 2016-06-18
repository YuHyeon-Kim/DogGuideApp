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
                Intent intent = new Intent(MainActivity.this, But1Activity.class);
                startActivity(intent);
            }
        });

        // *** 버튼 2 ***
        but2 = (Button)findViewById(R.id.but_2);
        but2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, But2Activity.class);
                startActivity(intent);
            }
        });

        // *** 버튼 3 ***
        but3 = (Button)findViewById(R.id.but_3);
        but3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, But3Activity.class);
                startActivity(intent);
            }
        });

        // *** 버튼 4 ***
        but4 = (Button)findViewById(R.id.but_4);
        but4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, But4Activity.class);
                startActivity(intent);
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
