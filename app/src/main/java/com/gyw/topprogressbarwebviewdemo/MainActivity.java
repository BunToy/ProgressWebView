package com.gyw.topprogressbarwebviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = "http://www.codesocang.com/kj-webview/";
        String url2 = "http://blog.csdn.net/gyw520gyw";
        ProgressWebView mWebView = new ProgressWebView(this);
        mWebView.loadUrl(url);
        setContentView(mWebView);

    }
}
