import java.util.Scanner;
public class AreaCircunferencia{
  public static void main (String[]args){
    Scanner scanner = new Scanner (System.in);
    double R, Area;
    System.out.println("Area de una circunferencia");
    System.out.println("ingrese el radio:");
    R = scanner.nextFloat();
    Area= (3.1416*R*R);
    System.out.println("El area de la circunferencia es:"+Area);
}
}
