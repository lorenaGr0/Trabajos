import java.util.Scanner;
public class Conagua {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Altura de la alberca: ");
    double A= input.nextDouble();
    System.out.println("Largo de la alberca: ");
    double L =input.nextDouble();
    System.out.println("Ancho de la alberca: ");
    double N = input.nextDouble();
    System.out.println("ingrese el costo del metro cubico de agua: ");
    double CM= input.nextDouble();
    double V=(A*L*N);

    double PAG= V*CM;
    System.out.println("Pago total de los metros cubicos consumidos: " + PAG);
  }
}
