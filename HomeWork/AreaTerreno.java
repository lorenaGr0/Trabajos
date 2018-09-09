import java.util.Scanner;
public class AreaTerreno{
  public static void main (String[]args){
    Scanner ingreso = new Scanner (System.in);
    int B,A,AT,AR,aT,bT, Area;
    System.out.println("Area del rectangulo");
    System.out.print("ingrese la base:");
    B=ingreso.nextInt();
    System.out.println("Ingrese la altura:");
    A=ingreso.nextInt();
    AR=B*A;
    System.out.println(" EL area del rectangulo es:" + AR );
    System.out.println("Area de un Triangulo");
    System.out.println("ingrese la base");
    bT= ingreso.nextInt();
    System.out.println("Ingrese la altura");
    aT=ingreso.nextInt();
    AT=(aT*bT)/2;
    System.out.println("El area del tiangulo es: " + AT );
    Area= AT+AR;
    System.out.println( "El area del terreno es" + Area);
}
}
