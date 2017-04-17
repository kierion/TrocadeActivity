package trocadeactivity.usj.com.trocadeactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText texto;
    private Button botao, botaoApagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (EditText) findViewById(R.id.editText);
        botao = (Button) findViewById(R.id.button);
        botaoApagar = (Button) findViewById(R.id.botaoApagar);


        //botão para apagar o texto digitado
        botaoApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                texto.setText("");

            }
        });

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String validaCmpoVazio = texto.getText().toString();

                if (validaCmpoVazio == null || validaCmpoVazio.equals("") ){

                    Toast t1 = Toast.makeText(MainActivity.this,"Digite algo!!!", Toast.LENGTH_SHORT);
                    t1.show();

                }
                else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("texto", texto.getText().toString());

                    startActivity(intent);
                }
            }
        });

    }
}
