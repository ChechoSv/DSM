import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero1,numero2,r;
    System.out.print("Ingrese numero 1:");
    numero1 = teclado.nextInt();

    System.out.print("Ingrese numero 2:");
    numero2 = teclado.nextInt();

    r=numero1%numero2;
    if(r==0){
      System.out.println("Resultado:"+r);
      System.out.println("Son divisibles");
    }else{
      System.out.println("Resultado:"+r);
      System.out.println("No son divisibles");
    }

  }
}