import java.util.Scanner;
public class PuebloDesconocido{
  public static void main( String[] args){
    Scanner input= new Scanner (System.in);
     System.out.println("indique el tipo de su tarjeta mayor o la que elija ");
     int TT = input.nextInt();
     System.out.println("Indique el limite actual de credito");
     double LA = input.nextDouble();
     double AC=0;
     if (TT == 1){
      AC=LA *.25;
      double NC= LA + AC;
     System.out.println("Su aumento es de: " + AC);
     System.out.println("Su nuevo limite es de: " + NC);
}
    if ( TT == 2){
      AC = LA * .35;
      double NC= LA + AC;
     System.out.println("Su aumento es de: " + AC);
     System.out.println("Su nuevo limite es de: " + NC);
    }
    if (TT==3){
      AC = LA * .40;
      double NC= LA + AC;
     System.out.println("Su aumento es de: " + AC);
     System.out.println("Su nuevo limite es de: " + NC);
    }
   if (TT >=4){
     AC = LA * .50;
     double NC= LA + AC;
    System.out.println("Su aumento es de: " + AC);
    System.out.println("Su nuevo limite es de: " + NC);
   }

  }
}
