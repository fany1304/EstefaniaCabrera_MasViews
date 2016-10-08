package example.org.masviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MasViewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_views);
    }

    public void sePulsa(View view){

        Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
    }
}
