package kr.hs.dbgus3577e_mirim.dogguideapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by 김유현 on 2016-06-22.
 */
public class RandomActivity  extends ActionBarActivity{

    ImageView mRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        mRandom = (ImageView)findViewById(R.id.imageView);

        //랜덤 함수
        Random r = new Random();
        int result = r.nextInt(3);

        if (result == 0) {
            mRandom.setImageResource(R.drawable.bone);
        }
        else if(result == 1){
            mRandom.setImageResource(R.drawable.cookie);
        }
        else if(result == 2){
            mRandom.setImageResource(R.drawable.meat);
        }
    }
}
