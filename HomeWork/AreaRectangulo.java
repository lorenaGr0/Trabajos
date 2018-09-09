import java.util.Scanner;
Public class AreaRectangulo{
  public static void main (String[]args){
    Scanner ingreso = new Scanner (System.in);
    int B, A, Area;
    System.out.println("Area de un rectangulo");
    System.out.print("ingresa la base:");
    B=ingreso.nextInt();
    System.out.print("Ingresa la altura:"):
    A=ingreso.nextInt();
    Area = B * A;
    System.out.println("El area es" + Area);
  }
}
