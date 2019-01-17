package ir.mftvanak.mftfridays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TestMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.main_menu, menu);

        menu.add(0,1,0,"MENU");
        menu.add(0,2,1,"MENU");
        menu.add(0,3,2,"MENU");
        menu.add(0,4,3,"MENU");

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.news:
                Toast.makeText(TestMenuActivity.this, "news!", Toast.LENGTH_LONG).show();
                break;
            case R.id.about:
                Toast.makeText(TestMenuActivity.this, "about!", Toast.LENGTH_LONG).show();
                break;
            case R.id.contact:
                Toast.makeText(TestMenuActivity.this, "contact!", Toast.LENGTH_LONG).show();
                break;
            case R.id.main:
                Toast.makeText(TestMenuActivity.this, "main!", Toast.LENGTH_LONG).show();
                break;
            case 1 :
                Toast.makeText(TestMenuActivity.this, "MENU!", Toast.LENGTH_LONG).show();
                break;


        }

        return super.onOptionsItemSelected(item);


    }
}
