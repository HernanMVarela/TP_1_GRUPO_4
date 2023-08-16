package frgp.utn.edu.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        TextView title = (TextView) findViewById(R.id.tvTitle);
        title.setText(R.string.title_activity_ejercicio2);
    }
}