import java.util.Scanner;
public class AreaCircunferencia{
  public static void main (String[]args){
    Scanner ingreso = new Scanner (System.in);
    int R, PI, Area;
    System.out.println ("Area de una Circunferencia");
    System.out.print("Ingresa el radio de la circunferencia:");
    R = ingreso.nextInt();
    System.out.print("Ingresa el valosr de PI 3.1416:");
    PI= ingreso.nextInt();
    Area = R * PI;
    System.out.println(" El area es :" + Area);
  }
}
