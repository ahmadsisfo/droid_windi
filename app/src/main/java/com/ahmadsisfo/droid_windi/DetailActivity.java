package com.ahmadsisfo.droid_windi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String file = getIntent().getExtras().getString("file");

        getSupportActionBar().setTitle(getIntent().getExtras().getString("name"));

        WebView webPage;

        webPage = (WebView) findViewById(R.id.webview);
        webPage.getSettings().setJavaScriptEnabled(true);
        webPage.getSettings().setPluginState(WebSettings.PluginState.ON);


        webPage.setWebViewClient(new WebViewClient()
        {
            // Override URL
            @SuppressWarnings("deprecation")
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                /*String vidUrl = url.replace("file:///android_asset/","");
                Intent intent=new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("video", vidUrl);
                startActivity(intent);*/
                return true;
            }
        });

        webPage.loadUrl(file);
    }

    @Override
    public Intent getSupportParentActivityIntent() {
        this.finish();
        return null;
    }
}
