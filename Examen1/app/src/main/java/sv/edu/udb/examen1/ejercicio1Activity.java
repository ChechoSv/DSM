package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ejercicio1Activity extends AppCompatActivity {
    EditText edtA;
    EditText edtB;
    EditText edtC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
    }

    public void resultadoEjercicio1(View view) {
        double a =  Double.parseDouble(edtA.getText().toString());
        double b = Double.valueOf(edtB.getText().toString());
        double c = Double.valueOf(edtC.getText().toString());

        Intent intent = new Intent(this,Ejercicio1Resultado.class);
        intent.putExtra("edtA",a);
        intent.putExtra("edtB",b);
        intent.putExtra("edtC",c);
        startActivity(intent);


    }
}