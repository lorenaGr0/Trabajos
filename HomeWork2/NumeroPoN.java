import java.util.Scanner;
public class NumeroPoN{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese un numero");
    int NUM = input.nextInt();
    if ( NUM ==0){
      System.out.println(" El numero " + NUM + " Es positivo " );
    }else{
        System.out.println(" El numero " + NUM + " Es negativo " );
    }

  }
  }
