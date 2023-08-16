package frgp.utn.edu.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        TextView title = (TextView) findViewById(R.id.tvTitle);
        title.setText(R.string.title_activity_ejercicio1);

        et1 = (EditText)findViewById(R.id.txtNum1);
        et2 = (EditText)findViewById(R.id.txtNum2);
        tv1 = (TextView)findViewById(R.id.txtResultado);
    }

    public void Sumar (View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int suma = num1 + num2;
        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    public void Volver(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this, MainActivity.class);
        startActivity(intent);
    }

}