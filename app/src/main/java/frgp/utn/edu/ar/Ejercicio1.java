package frgp.utn.edu.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        TextView title = (TextView) findViewById(R.id.tvTitle);
        title.setText(R.string.title_activity_ejercicio1);
    }
}