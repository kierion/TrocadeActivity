package trocadeactivity.usj.com.trocadeactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends Activity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){

            String textoPassado = bundle.getString("texto");
            text.setText(textoPassado);
        }
        else {
            Toast t = Toast.makeText(Main2Activity.this, "Nada Digitado", Toast.LENGTH_LONG);
            t.show();
        }
    }
}
