package frgp.utn.edu.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        TextView title = (TextView) findViewById(R.id.tvTitle);
        title.setText(R.string.title_activity_ejercicio2);
        tvResultado = (TextView)findViewById(R.id.resultado);
    }

    public void Limpiar(View view){
        tvResultado.setText("0");
    }
}