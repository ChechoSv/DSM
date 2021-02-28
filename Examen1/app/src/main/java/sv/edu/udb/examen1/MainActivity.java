package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarEjercicio1(View view) {
        Intent intent = new Intent(this,ejercicio1Activity.class);
        startActivity(intent);
    }

    public void mostrarEjercicio2(View view) {
        Intent intent = new Intent(this,ejercicio2Activity.class);
        startActivity(intent);
    }

    public void mostrarEjercicio3(View view) {
        Intent intent = new Intent(this,Ejercicio3Activity.class);
        startActivity(intent);
    }
}