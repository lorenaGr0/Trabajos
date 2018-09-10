import java.util.Scanner;
public class Garrafones{
  public static void main (String [] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Ingrese la cantidad de litros: ");
    double L= input.nextDouble();
    System.out.println("Ingrese el precio del galon:");
    double PG = input.nextDouble();
    double GAL=(L/3.785);
    System.out.println("Ganancia por la entrega de leche: ");
    double TG = input.nextDouble();
    double GA=(PG*GAL);
    System.out.println("Ganancia total en el dia" + GA);

  }
}
