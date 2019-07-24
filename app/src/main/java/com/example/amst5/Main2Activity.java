package com.example.amst5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        WebView webView1 = (WebView) findViewById(R.id.webView);
        WebSettings conf = webView1.getSettings();
        conf.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        //webView1.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView1.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView1.setWebChromeClient(new WebChromeClient());
        webView1.loadUrl("https://www.youtube.com/watch?v=yKLjmSMv1KA");
        webView1.setVisibility(View.VISIBLE);


    }

    public void regresar(View view) {
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
}
