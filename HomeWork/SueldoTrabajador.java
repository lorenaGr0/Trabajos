import java.util.Scanner;
 public class SueldoTrabajador {
  public static void main (String[] args) {
  Scanner ingreso = new Scanner(System.in);
  System.out.println("Horas trabajadas: ");
  double HT = ingreso.nextInt();
  System.out.println("Pago por horas: ");
  double PH= ingreso.nextInt();
  double SS=HT*PH;
  System.out.println("Sueldo semanal del trabajador: " + SS);
}
}
