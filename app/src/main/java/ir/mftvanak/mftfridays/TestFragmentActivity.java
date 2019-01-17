package ir.mftvanak.mftfridays;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class TestFragmentActivity extends AppCompatActivity {


    Uri videoAddtess = Uri.parse("https://hw1.cdn.asset.aparat.com/aparat-video/1fc0c09a42ea398297261f16f0fe457813364517-144p__52484.mp4");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment);

        VideoView vv = findViewById(R.id.vv);
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(videoAddtess);
        vv.start();


        TextView tv = findViewById(R.id.tv);
        tv.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));

    }
}
