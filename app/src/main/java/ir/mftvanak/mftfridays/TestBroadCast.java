package ir.mftvanak.mftfridays;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.Toast;

public class TestBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("BROAD","OnReceive");

        Toast.makeText(context, "Phone Is ready now", Toast.LENGTH_LONG).show();
    }
}
