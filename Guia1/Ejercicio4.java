import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double x,y;
    int inicio=1,c1=0,c2=0,c3=0,c4=0,fin;
    System.out.print("Cuantos numeros dese ingresar?");
    fin=teclado.nextInt();

  while(inicio<=fin){
    System.out.print("Ingrese cordenada x: ");
    x = teclado.nextDouble();
        System.out.print("Ingrese cordenada Y: ");
     y = teclado.nextDouble();
    if(x>0 && y>0){
      c1 = c1+1;
    }else if(x>0 && y<0){
      c3=c3+1;
    }else if(x<0 && y<0){
      c4=c4+1;
    }else{
      c2=c2+1;
    }
    inicio=inicio+1;
  }

   System.out.println("Numeros ubicados en cuadrante 1: " +c1);
   System.out.println("Numeros ubicados en cuadrante 2: " +c2);
   System.out.println("Numeros ubicados en cuadrante 3: " +c3);
   System.out.println("Numeros ubicados en cuadrante 4: " +c4);
   
  
}
}