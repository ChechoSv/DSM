package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio3Activity extends AppCompatActivity {

    EditText nameE1,nameE2,nameE3,cE1,cE2,cE3,hE1,hE2,hE3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);

        nameE1=findViewById(R.id.nE1);
        nameE2=findViewById((R.id.nE2));
        nameE3=findViewById((R.id.nE3));
        cE1=findViewById(R.id.cE1);
        cE2=findViewById((R.id.cE2));
        cE3=findViewById((R.id.cE3));
        hE1=findViewById(R.id.hE1);
        hE2=findViewById((R.id.hE2));
        hE3=findViewById((R.id.hE3));

    }


    public void CapturarDatos2(View view) {
        String n1 = nameE1.getText().toString();
        String n2 = nameE2.getText().toString();
        String n3 = nameE3.getText().toString();
        String c1 = cE1.getText().toString();
        String c2 = cE2.getText().toString();
        String c3 = cE3.getText().toString();
        double a =  Double.parseDouble(hE1.getText().toString());
        double b = Double.valueOf(hE2.getText().toString());
        double c = Double.valueOf(hE3.getText().toString());


        Intent intent = new Intent(this,ejercicioPrueba.class);
        intent.putExtra("nameE1",n1);

        intent.putExtra("nameE2",n2);
        intent.putExtra("nameE3",n3);
        intent.putExtra("cE1",c1);
        intent.putExtra("cE2",c2);
        intent.putExtra("cE3",c3);
        intent.putExtra("hE1", a);
        intent.putExtra("hE2", b);
        intent.putExtra("hE3", c);
        startActivity(intent);
    }
}