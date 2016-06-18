package kr.hs.dbgus3577e_mirim.dogguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by 김유현 on 2016-06-18.
 */
public class BrowserActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editUrl;
    Button butMove, butPrev;
    WebView web;

    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_browser);
        editUrl=(EditText)findViewById(R.id.edit_url);
        butMove=(Button)findViewById(R.id.but_move);
        butPrev=(Button)findViewById(R.id.but_prev);
        web=(WebView)findViewById(R.id.web);butMove.setOnClickListener(this);
        butPrev.setOnClickListener(this);
        web.setWebViewClient(new WebViewClient());
        WebSettings webSet=web.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        web.loadUrl("http://www.google.co.kr");

    }

    @Override
    public void onClick(View v) {
        String url=null;
        switch (v.getId()){
            case R.id.but_move:
                url=editUrl.getText().toString();
                if (!url.contains("http"))
                    url="http://"+url;
                web.loadUrl(url);
                break;
            case R.id.but_prev:
                web.goBack();
                break;
        }
    }
}
