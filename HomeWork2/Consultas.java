import java.util.Scanner;
public class Consultas{
  public static void main (String [] args){
    Scanner input= new Scanner (System.in);
    System.out.println("Numero de cita");
    int nc = input.nextInt();
    double cc, tot;
    if (nc <= 3){
      cc=200;
      tot=nc*cc;
    }
    if (nc <= 5){
      cc=150;
      tot= (nc-5 )*150+600;
    }
    if (nc<=8){
      cc=100;
      tot = ( nc - 5 *  100 + 900);
    }else{
      cc=50;
      tot= (nc - 8) * 50 + 1200;
    }
    System.out.println("El costo de la consulta es : " + cc);
    System.out.println("El costo del tratamiento es : " + tot);
  }
}
