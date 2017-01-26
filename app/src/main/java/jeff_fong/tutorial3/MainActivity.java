package jeff_fong.tutorial3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forceError();
    }

    public void forceError() {
        if (true) {
            throw new Error("Whoops");
        }
    }
}
