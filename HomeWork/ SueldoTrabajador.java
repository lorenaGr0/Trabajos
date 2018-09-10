import java.util.Scanner;
 public class SueldoTrabajador{
  public static void main (String[]args){
  Scanner ingreso= new Scanner(System.in);
  System.out.println("Horas trabajadas: ");
  int HT, PH, SS;
  HT = ingreso.nextInt();
  System.out.println("Pago por horas: ");
  PH= ingreso.nextInt();
  SS=HT*PH;
  Systemout.println("Sueldo semanal del trabajador: " + SS);
}
}
