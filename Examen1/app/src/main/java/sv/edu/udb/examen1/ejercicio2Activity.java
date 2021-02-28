package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ejercicio2Activity extends AppCompatActivity {
EditText edtVotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        edtVotos = findViewById(R.id.edtVotos);
    }

    public void resultadoEjercicio2(View view) {
        String votos = edtVotos.getText().toString();

        Intent i = new Intent(this,Ejercicio2Resultado.class);
        i.putExtra("edtVotos",votos);
        startActivity(i);

    }
}