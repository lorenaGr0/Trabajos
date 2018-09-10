import java.util.Scanner;
public class Sueldo.java{
  public static void main(String[]args){
    Scanner ingreso= new Scanner(System.in);
      int HT,PH, SS;
    System.out.println("Horas trabajadas:");
    HT= ingreso.nextInt();
    System.out.println("Pago por hora: ");
    PH= ingreso.nextInt();
    SS=HT*PH;
    System.out.println("sueldoeldo semanal: " + SS);
  }
}
