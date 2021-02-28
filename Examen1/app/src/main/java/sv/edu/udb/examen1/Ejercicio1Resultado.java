package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio1Resultado extends AppCompatActivity {
TextView tvResultado1;
TextView tvResultado2;
Double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1_resultado);
        tvResultado1 = findViewById(R.id.tvResultado1);
        tvResultado2 = findViewById(R.id.tvResultado2);
        Bundle datos = getIntent().getExtras();
         a = datos.getDouble("edtA");
         b = datos.getDouble("edtB");
         c = datos.getDouble("edtC");
         mostrarResultado();


    }

    private void mostrarResultado() {


        Double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
        Double x2= (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);



        tvResultado1.setText(String.valueOf(x1));
        tvResultado2.setText(String.valueOf(x2));
    }
}