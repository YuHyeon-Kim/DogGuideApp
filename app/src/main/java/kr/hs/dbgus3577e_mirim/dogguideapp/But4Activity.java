package kr.hs.dbgus3577e_mirim.dogguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 김유현 on 2016-06-18.
 */
public class But4Activity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_but4);
    }

    // 뒤로가기
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}