package frgp.utn.edu.ar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class Ejercicio2 extends AppCompatActivity {

    private TextView res;
    boolean isResult = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        res = (TextView)findViewById(R.id.resultado);
        TextView title = (TextView) findViewById(R.id.tvTitle);
        title.setText(R.string.title_activity_ejercicio2);
    }

    public void onClick(View view) {
        addValue(view.getTag().toString());
    }

    //Metodo para agregar los valores de los botones al textView
    public void addValue(String value) {
        if (res.getText().toString().equals("0") || isResult) {
            res.setText("");
        }
        isResult = false;
        res.setText(res.getText().toString()+value);
    }

    //Metodo para limpiar el textView
    public void clear(View view) {
        res.setText("0");
    }

    //Metodo para realizar las operaciones
    public void operar(View view) {
        DoubleEvaluator evaluator = new DoubleEvaluator();
        try {
            String resultado = String.valueOf(evaluator.evaluate(res.getText().toString()));
            if(resultado.length()>20){
                res.setText("Too Large");
            }else{
                res.setText(resultado);
            }
        } catch (Exception e) {
            res.setText("ERROR");
        }
        isResult = true;
    }

    public void Volver(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this, MainActivity.class);
        startActivity(intent);
    }
}