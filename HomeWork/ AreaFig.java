import java.util.Scanner;
public class areaFig{
  public static void main(String [] args ){
      Scanner input =new Scanner(System.in);
      System.out.println("Ingrese el valor de la base: ");
      double R = input.nextDouble();
      System.out.println("Ingrese el valor de la Hipotenusa");
      double H = input.nextDouble();
      double PI;
      PI= 3.1416;
      double C;
      C=(H*H)-(R*R);
      Math.sqrt(C);
      double AT;
      AT=(2*(R*C))/2;
      double AC;
      AC= (PI*(R*R))/2;
      double Area;
      Area=AT+AC;
      System.out.println("El area de la figura es: " + Area);
  }
}
