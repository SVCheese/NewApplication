package cheese.soft.newapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button);

        Button b3 = findViewById(R.id.button);


        TextView tv = findViewById(R.id.textView);
    }
}
