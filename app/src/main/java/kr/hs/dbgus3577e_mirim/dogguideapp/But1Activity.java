package kr.hs.dbgus3577e_mirim.dogguideapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 김유현 on 2016-06-18.
 */
public class But1Activity extends AppCompatActivity{

    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_but1);
    }

    // 뒤로가기
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
