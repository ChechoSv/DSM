package sv.edu.udb.guia03discusion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contador = 1;
    TextView tvNumero;
    Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Actividad 1","onCreate");

        tvNumero=(TextView)findViewById(R.id.textViewNumero);
        btnSumar = findViewById(R.id.btnSumar);


    }

    public void llamar(View view) {

        if (contador>9){
            contador=0;
            tvNumero.setText(Integer.toString(contador));
        }else {
            tvNumero.setText(Integer.toString(contador));
            contador ++;
        }






    }
}