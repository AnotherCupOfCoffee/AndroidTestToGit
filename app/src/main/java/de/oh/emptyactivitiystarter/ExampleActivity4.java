package de.oh.emptyactivitiystarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import static android.webkit.WebSettings.*;

public class ExampleActivity4 extends AppCompatActivity {

   private TextView txt_URL;
   private WebView wv_browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4);

        this.txt_URL = (TextView) this.findViewById(R.id.textView4);

        this.wv_browser = (WebView) this.findViewById(R.id.wvBrowser);

        this.txt_URL.setText(R.string.urladdress);


        //WebView myWebView = new WebView(activityContext);
        //setContentView(wv_browser);

        if (Build.VERSION.SDK_INT >= 19)
            wv_browser.getSettings().setCacheMode(LOAD_CACHE_ELSE_NETWORK);

        WebSettings webSettings = wv_browser.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wv_browser.loadUrl(getString(R.string.urladdress));

        //browser.loadUrl("http://www.tutorialspoint.com");


        // When user click "Click me" button.
//        this.button_save.setOnClickListener(new Button.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                //  editTextTextPassword.setText("You click button");
//
//                ExampleActivity4.this.finish();
//            }
//        });


//        // When user click "Back" button.
//        this.button_cancel.setOnClickListener(new Button.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // Back to previous Activity.
//                ExampleActivity4.this.finish();
//
//            }
//        });
    }
}