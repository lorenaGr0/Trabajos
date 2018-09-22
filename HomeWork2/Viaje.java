import java.util.Scanner;
public class Viaje{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Numero de alumnos que realizan el viaje");
    int na = input.nextInt();
    double pa =input.nextDouble();
    double  tot = input.nextDouble();
    if ( na >= 100){
      pa = 65.0;
    }
     if (na >= 50){
       pa =70.0;
    }
    if (na >=95.0){
      pa= 95.0;
    pa = 4000 / na;
    }else{
      tot = pa*na;
    }
    System.out.println("El pago individual es : " + pa);
    System.out.println("El pago total es : " + tot);
  }
}
