package ir.mftvanak.mftfridays;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PreferenceManager.getDefaultSharedPreferences(MainActivity.this).edit()
                .putString("name", "Pouya").apply();


        String s = PreferenceManager.getDefaultSharedPreferences(MainActivity.this).getString("name", "There is no name saved");


        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();

        TextView textView = findViewById(R.id.txt);

        textView.setText("Pouya");
        textView.setTextSize(60);


        Button button = findViewById(R.id.btn);


        Button btnDialog = findViewById(R.id.btnDialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).create();
                dialog.setTitle("Attention!");
                dialog.setMessage("This is a dialog");
                dialog.setButton(AlertDialog.BUTTON_POSITIVE, "I understand", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();

                    }
                });


                dialog.show();


            }
        });





        /////

        Intent intent = new Intent(MainActivity.this,TestService.class);
        startService(intent);

        //////


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivityForResult(intent, 2300);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == 2300) {
            if (resultCode == Activity.RESULT_OK) {
                String s = data.getStringExtra("name");
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }
        }
    }
}
