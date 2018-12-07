package ir.mftvanak.mftfridays;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        WebView webView = findViewById(R.id.web);
        webView.setWebViewClient(new CustomWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://google.com");
    }


    public class CustomWebViewClient extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Toast.makeText(WebViewActivity.this, "Started", Toast.LENGTH_LONG).show();

        }


        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

            Toast.makeText(WebViewActivity.this, "Finished", Toast.LENGTH_LONG).show();

        }
    }

}
