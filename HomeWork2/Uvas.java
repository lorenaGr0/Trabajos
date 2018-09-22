import java.util.Scanner;
public class Uvas{
  public static void main ( String [] args){
    Scanner input = new Scanner (System.in);
    double p;
    System.out.println("Kilogramos de produccion");
    int k= input.nextInt();
    System.out.println("Tipo de uva : a o b ");
    String ti = input.next();
    if ( ti.equalsIgnoreCase ("A")){
      System.out.println("Ingrese el tipo de uva: 1 o 2");
      int ta = input.nextInt();
      if (ta ==1){
        p = k *.20;
        System.out.println("Ganancia obtenida : " + p);
      }else if (ta ==2){
      p=k* .30;
      System.out.println("Ganancia  obtenida : " + p);
    }else if(ti.equalsIgnoreCase("B")){
      System.out.println("Ingrese el tamaño de la uva: 1 o 2");
      if (ta==1){
        p = k* .30;
        System.out.println("Ganancia obtenida : " + p);
      }else if (ta == 2){
        p= k * .50;
        System.out.println("Ganancia obtenida : " + p);
      }
      }
    }
}
}
