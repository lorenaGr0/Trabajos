import java.util.Scanner;
public class Traje{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese el costo del traje: ");
    double ct = input.nextDouble();
    double de,pf;
    if (ct > 2500){
      de = ct * 0.15;
    }else{
      de = ct * 0.08;
    }
     pf = ct - de;
      System.out.println("El precio final es : " + pf );
      System.out.println("El descuento es : " + de );
  }
}
