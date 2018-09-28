import java.util.Scanner;
public class ChimeFon{
  public static void main (String [] args){
    Scanner input;
    input = new Scanner (System.in);
    Double pag;
    Double imp;
    Double tot;
    pag = 0.0;
    imp = 0.0;
    System.out.println("Ingrese los minutos de las llamadas");
    int ti= input.nextInt();
    if (ti <= 5){
      pag = ti * 1.0;
    }else if (ti > 5 && ti <= 8){
      pag = ((ti - 5)* .80) + 5 ;
    }else if (ti> 8 && ti <= 10){
      pag = ((ti - 8) * .70) + 7.4;
    }else if (ti > 10){
      pag = ((ti - 8) * .70) * 7.4;
    }
    System.out.println("Ingresa el dia de la llamada");
    String di = input.next();
    if (di.equalsIgnoreCase("Domingo")){
      imp =( pag = .03);
    }else{
      System.out.println("Ingrese el turno : Matutino o Vespertino");
      String tu = input.next();
      if (tu.equalsIgnoreCase("Matutino")){
        imp = (pag * .15);
      }else if (tu.equalsIgnoreCase("Vespertino")){
        imp = (pag * .10);
      }
    }
    tot = imp +  pag;
    System.out.println("El pago es : " + pag);
    System.out.println("El importe es : " + imp);
    System.out.println("Pago total : " + tot);
  }
}
