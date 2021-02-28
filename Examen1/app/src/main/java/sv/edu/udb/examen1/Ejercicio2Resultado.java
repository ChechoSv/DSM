package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class Ejercicio2Resultado extends AppCompatActivity {
    TextView tvResultado;
    String textoEntrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2_resultado);
        tvResultado = findViewById(R.id.tvResultadoEj2);


        Bundle datos = getIntent().getExtras();
        textoEntrada = datos.getString("edtVotos");
        mostrarResultado();

    }

    private void mostrarResultado() {
        String[] candidatos={"1","2","3","4"};
        int cantCandidatos=0;


        String numeroMasRepetido = "";
        int cantMasVotos=0;


        List<String> listaCadena = Arrays.asList(textoEntrada.split(","));

        for (String v : candidatos){
            cantCandidatos += Collections.frequency(listaCadena, v);
        }
        //System.out.println("Hay " + cantCandidatos + " votos");
        tvResultado.setText("Hay " + cantCandidatos+" votos");

        //Contamos todos
        for(String item:listaCadena){
            int cantidad = Collections.frequency(listaCadena, item);
            if(cantMasVotos < cantidad && !item.equals(" ")){
                numeroMasRepetido = item;
                cantMasVotos = cantidad;


            }
            //System.out.println("El candidato " + item + " tiene " + cantidad +" votos");
            Toast toast1 = Toast.makeText(getApplicationContext(),"El candidato " + item + " tiene " + cantidad +" votos",Toast.LENGTH_SHORT);
            toast1.show();
        }
        //imprimimos la letra que más se repite
        //System.out.println(String.format("El candidato %s es la que mayor votos obtuvo, con %o votos", numeroMasRepetido, cantMasVotos));
        //tvWinner.setText("El candidato " + numeroMasRepetido+"  es la que mayor votos obtuvo, con " + cantMasVotos+" votos");
        Toast toast2 = Toast.makeText(getApplicationContext(),"El candidato " + numeroMasRepetido+"  es la que mayor votos obtuvo, con " + cantMasVotos+" votos",Toast.LENGTH_SHORT);
        toast2.show();



    }
}
