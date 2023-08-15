package frgp.utn.edu.ar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegarEjercicio2(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this, Ejercicio2.class);
        startActivity(intent);
    }

    public void navegarEjercicio1(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this, Ejercicio1.class);
        startActivity(intent);
    }
}