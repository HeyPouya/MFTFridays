package ir.mftvanak.mftfridays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TestListActivity extends AppCompatActivity {

    Boolean hasUserClickedOnBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_list);


        if (ContextCompat.checkSelfPermission(TestListActivity.this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(TestListActivity.this, new String[]{Manifest.permission.RECORD_AUDIO}, 1430);


        }


        List<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Aref Rezaei");
        list.add("Fateme Abdi");
        list.add("Hadi Abedi");
        list.add("Alireza Ebrahimi");
        list.add("Neda Abedi");
        list.add("Maryam Tasviri");
        list.add("Samira EShaghi");
        list.add("Marjan Raad");
        list.add("Mamal Riazati");

        RecyclerView recycler = findViewById(R.id.recycler);
        NamesAdapter adapter = new NamesAdapter(list);
        recycler.setAdapter(adapter);


        recycler.setLayoutManager(new GridLayoutManager(TestListActivity.this, 2, RecyclerView.VERTICAL, false));


        new Thread(new Runnable() {
            @Override
            public void run() {

                //some calcs


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Main Thread
                    }
                });

            }
        }).start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(TestListActivity.this, "Welcome!", Toast.LENGTH_LONG).show();
            }
        }, 5000);

    }

    @Override
    public void onBackPressed() {

        if (hasUserClickedOnBack == false) {
            Toast.makeText(TestListActivity.this, "Please press back again", Toast.LENGTH_LONG).show();
            hasUserClickedOnBack = true;

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBack = false;
                }
            }, 3000);
        } else {
            super.onBackPressed();
        }
    }
}
