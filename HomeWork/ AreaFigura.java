import java.util.Scanner;
 public class AreaFigura{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de la base del triangulos: ")
    double R= sc.nextDouble();
    Scanner ingreso= new scanner(System.in);
    System.out.println("Ingrese el valor de H para la hipotenusa: ");
    double H= ingreso.nextDouble();
    double PI;
    PI=3.1416;
    double C;
    c=(H*H)-(R*R);
    math.SQRT(C);
    double AT;
    AT=(2*(R*C))/2;
    double AC;
    AC=(PI*(R*R))/2;
    double area;
    area=AT*AC;
    System.out.println("El area de la figura es:" + area);
  }
 }
