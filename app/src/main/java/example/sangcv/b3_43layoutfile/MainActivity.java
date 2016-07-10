package example.sangcv.b3_43layoutfile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tv = (TextView) findViewById(R.id.tv);
    }
    public void showMessage(String message) {
        tv.setText(message);
    }
    public void showText (View v) {
        if(v == btn1) showMessage(getString(R.string.hello_text));
        else {
            if(v == btn2) showMessage(getString(R.string.bye_text));
        }
    }
}