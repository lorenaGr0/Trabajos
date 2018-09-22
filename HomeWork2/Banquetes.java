import java.util.Scanner;
public class Banquetes{
  public static void main (String []args){
    Scanner input = new Scanner (System.in);
    System.out.println ("Numero de personas");
    int np = input.nextInt();
    double tot = input.nextDouble();
    if (np > 300 ){
      tot= np*75;
    }
    if (tot > 200){
      tot = np* 85;
    }else{
      tot =np* 95;
    }
    System.out.println("El total es: " + tot );
    }
  }
