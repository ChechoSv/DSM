package sv.edu.udb.examen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ejercicioPrueba extends AppCompatActivity {
    Double h1,h2,h3;
    String n1,n2,n3,c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_prueba);
        Bundle datos = getIntent().getExtras();
        n1=datos.getString("nameE1");
        n2=datos.getString("nameE2");
        n3=datos.getString("nameE3");
        c1=datos.getString("cE1");
        c2=datos.getString("cE2");
        c3=datos.getString("cE3");
        h1=datos.getDouble("hE1");
        h2=datos.getDouble("hE2");
        h3=datos.getDouble("hE3");
        mostrarResultado();

    }

    private void mostrarResultado() {


        double salarioBase = 1560;
        double sT1, sT2, sT3;
        double T1,T2,T3;
        double bono1 ,bono2,bono3,bono4;

        String cargo1=c1,cargo2=c2,cargo3=c3;


        switch (cargo1){
            case "gerente":
                if (h1 <= 160) {
                    sT1 = h1 * 9.75;
                    bono1=sT1*0.1;
                    T1=sT1-(sT1*0.2213)+bono1;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();


                } else {
                    sT1 = ((h1 - 160) * 11.75) + salarioBase;
                    bono1=sT1*0.1;
                    T1=sT1-(sT1*0.2213+bono1);
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;

            case "asistente":
                if (h1 <= 160) {
                    sT1 = h1 * 9.75;
                    bono2=sT1*0.05;
                    T1=sT1-(sT1*0.2213)+bono2;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();


                } else {
                    sT1 = ((h1 - 160) * 11.75) + salarioBase;
                    bono2=sT1*0.05;
                    T1=sT1-(sT1*0.2213)+bono2;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();
                }

                break;
            case "secretaria":
                if (h1 <= 160) {
                    sT1 = h1 * 9.75;
                    bono3=sT1*0.03;
                    T1=sT1-(sT1*0.2213)+bono3;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT1 = ((h1 - 160) * 11.75) + salarioBase;
                    bono3=sT1*0.03;
                    T1=sT1-(sT1*0.2213)+bono3;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;
            default:
                if (h1 <= 160) {
                    sT1 = h1 * 9.75;
                    bono4=sT1*0.02;
                    T1=sT1-(sT1*0.2213)+bono4;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT1 = ((h1 - 160) * 11.75) + salarioBase;
                    bono4=sT1*0.02;
                    T1=sT1-(sT1*0.2213)+bono4;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n1 + " Cargo: " + c1 +" Sueldo total " + T1,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;
        }

        //SWITCH 2

        switch (cargo2){
            case "gerente":
                if (h1 <= 160) {
                    sT2 = h1 * 9.75;
                    bono1=sT2*0.1;
                    T2=sT2-(sT2*0.2213)+bono1;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();


                } else {
                    sT2 = ((h1 - 160) * 11.75) + salarioBase;
                    bono1=sT2*0.1;
                    T2=sT2-(sT2*0.2213+bono1);
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;

            case "asistente":
                if (h1 <= 160) {
                    sT2 = h1 * 9.75;
                    bono2=sT2*0.05;
                    T2=sT2-(sT2*0.2213)+bono2;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT2 = ((h1 - 160) * 11.75) + salarioBase;
                    bono2=sT2*0.05;
                    T2=sT2-(sT2*0.2213)+bono2;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();
                }

                break;
            case "secretaria":
                if (h1 <= 160) {
                    sT2 = h1 * 9.75;
                    bono3=sT2*0.03;
                    T2=sT2-(sT2*0.2213)+bono3;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT2 = ((h1 - 160) * 11.75) + salarioBase;
                    bono3=sT2*0.03;
                    T2=sT2-(sT2*0.2213)+bono3;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;
            default:
                if (h1 <= 160) {
                    sT2 = h1 * 9.75;
                    bono4=sT2*0.02;
                    T2=sT2-(sT2*0.2213)+bono4;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT2 = ((h1 - 160) * 11.75) + salarioBase;
                    bono4=sT2*0.02;
                    T2=sT2-(sT2*0.2213)+bono4;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n2 + " Cargo: " + c2 +" Sueldo total " + T2,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;
        }

        //Switch 3

        switch (cargo3){
            case "gerente":
                if (h1 <= 160) {
                    sT3 = h1 * 9.75;
                    bono1=sT3*0.1;
                    T3=sT3-(sT3*0.2213)+bono1;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();


                } else {
                    sT3 = ((h1 - 160) * 11.75) + salarioBase;
                    bono1=sT3*0.1;
                    T3=sT3-(sT3*0.2213+bono1);
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;

            case "asistente":
                if (h1 <= 160) {
                    sT3 = h1 * 9.75;
                    bono2=sT3*0.05;
                    T3=sT3-(sT3*0.2213)+bono2;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT3 = ((h1 - 160) * 11.75) + salarioBase;
                    bono2=sT3*0.05;
                    T3=sT3-(sT3*0.2213)+bono2;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();
                }

                break;
            case "secretaria":
                if (h1 <= 160) {
                    sT3 = h1 * 9.75;
                    bono3=sT3*0.03;
                    T3=sT3-(sT3*0.2213)+bono3;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT3 = ((h1 - 160) * 11.75) + salarioBase;
                    bono3=sT1*0.03;
                    T3=sT3-(sT3*0.2213)+bono3;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;
            default:
                if (h1 <= 160) {
                    sT3 = h1 * 9.75;
                    bono4=sT3*0.02;
                    T3=sT3-(sT3*0.2213)+bono4;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();

                } else {
                    sT3 = ((h1 - 160) * 11.75) + salarioBase;
                    bono4=sT3*0.02;
                    T3=sT3-(sT3*0.2213)+bono4;
                    Toast toast1 = Toast.makeText(getApplicationContext(),"El empleado " + n3 + " Cargo: " + c3 +" Sueldo total " + T3,Toast.LENGTH_LONG);
                    toast1.show();
                }
                break;
        }







    }
}