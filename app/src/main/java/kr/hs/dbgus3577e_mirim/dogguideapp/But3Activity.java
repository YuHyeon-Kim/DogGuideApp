package kr.hs.dbgus3577e_mirim.dogguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by 김유현 on 2016-06-18.
 */
public class But3Activity extends AppCompatActivity {
    Button rbut;
    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_but3);

        // *** 버튼 3 ***
        rbut = (Button)findViewById(R.id.random_but);
        rbut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(But3Activity.this, RandomActivity.class);
                startActivity(intent);
            }
        });
    }

    // 뒤로가기
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}