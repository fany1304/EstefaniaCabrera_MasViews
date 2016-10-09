package example.org.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MasViewsActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_views);

        entrada = (EditText)findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);
    }

    public void sePulsa(View view){

        if(entrada.getText().length() > 0){

            salida.setText(String.valueOf(Float.parseFloat(entrada.getText().toString())*2.0));
        }
        else{

            Toast.makeText(this, "Debe escribir un número", Toast.LENGTH_SHORT).show();
            salida.setText("''");
        }

    }

    public void sePulsa0(View view){

        entrada.setText(entrada.getText() + (String)view.getTag());
    }

}
