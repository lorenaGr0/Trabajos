import java.util.Scanner;
public class AreaTerreno{
  public static void main (String[]args){
    Scanner ingreso = new Scanner (System.in);
    int B,A,AT,AR,r,a, Area;
    System.out.println("Area de un terreno");
    System.out.print("ingrese la base:");
    B=ingreso.nextInt();
    b=ingreso.nextInt();
    System.out.println("Ingrese la altura:");
    A=ingreso.nextInt();
    a=ingreso.nextInt();
    AR=B*A;
    AT=(b*a)/2;
    Area= AT+AR;
    System.out.println(" EL area del rectangulo es:" + AR );
    System.out.println("El area del tiangulo es: " + AT );
    System.out.println( "El area del terreno es" + Area);
  }
}
