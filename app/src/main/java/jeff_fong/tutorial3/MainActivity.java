package jeff_fong.tutorial3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "MyFirstAppLogging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //forceError();

        Log.i(DEBUG_TAG, "In the onCreate() method of the Welcome App");
    }

    public void forceError() {
        if (true) {
            throw new Error("Whoops");
        }
    }
}
