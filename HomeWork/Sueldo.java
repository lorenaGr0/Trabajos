import java.util.Scanner;
 public class Sueldo{
   public static void main (String[]args){
     Scanner ingreso= new Scanner (System.in);
     int HT, PH, SS;
     System.out.println("Sueldo semanal de un trabajador");
     System.out.println("Horas trabajadas: ");
     HT=ingreso.nextInt();
     System.out.println("Pago por hora: ");
     PH= ingreso.nextInt();
     SS=HT*PH;
     System.out.println("Sueldo semanal: " + SS);
   }
 }
