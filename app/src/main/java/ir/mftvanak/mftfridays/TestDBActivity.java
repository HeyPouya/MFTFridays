package ir.mftvanak.mftfridays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TestDBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_db);


        TextView tv = findViewById(R.id.txt);
        SQLiteDBHelper helper = new SQLiteDBHelper(TestDBActivity.this, "mft", null, 1);

        helper.insertStudent("Pouya", "Heydari");
        helper.insertStudent("Ali", "Heydari");
        helper.insertStudent("MOhammad", "Heydari");
        helper.insertStudent("Masoud", "Heydari");

        tv.setText(helper.getStudentsNames());


    }
}
