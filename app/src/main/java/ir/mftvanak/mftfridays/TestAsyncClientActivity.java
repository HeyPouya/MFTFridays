package ir.mftvanak.mftfridays;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

import androidx.appcompat.app.AppCompatActivity;
import ir.mftvanak.mftfridays.aladhanmodel.AlAdhanModel;

public class TestAsyncClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_client);

        String url = "http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8";

        AsyncHttpClient client = new AsyncHttpClient();
        final TextView txt = findViewById(R.id.txt);


        client.get(url, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);


                Gson gson = new Gson();
                AlAdhanModel model = gson.fromJson(response.toString(), AlAdhanModel.class);


               txt.setText(model.getData().getTimings().getFajr());

            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                Log.d("MFTFRIDAYSTEST", "on Failure");

            }


        });
    }
}

