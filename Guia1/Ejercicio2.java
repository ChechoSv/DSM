import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double nota;
    int x=1,aprobado=0,reprobado=0;

  while(x<=10){
    System.out.print("Ingrese una nota");
    nota = teclado.nextDouble();
    if(nota>=7){
      aprobado = aprobado+1;
    }else{
      reprobado=reprobado+1;
    }
    x=x+1;
  }

   System.out.print("aprobado: "+aprobado);
   System.out.print("Reprobados: "+reprobado );
   
  
}
}