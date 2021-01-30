import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double numero;
    int x=1,aprobado=0,reprobado=0,y;
    System.out.print("Cuantos numeros dese ingresar?");
    y=teclado.nextInt();

  while(x<=y){
    System.out.print("Ingrese un numero");
    numero = teclado.nextDouble();
    if(numero>=0){
      aprobado = aprobado+1;
    }else{
      reprobado=reprobado+1;
    }
    x=x+1;
  }

   System.out.print("Positivos: " +aprobado);
   System.out.print("Negativos: "+ reprobado );
   
  
}
}