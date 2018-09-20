import java.util.Scanner;
public class ValorMayor{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a value");
    int A = input.nextInt();
    System.out.println("Enter anothe value");
    int B = input.nextInt();
    int M;
    if ( A > B){
      M=A;
      System.out.println( A + "es mayor que" + B);
    }else{
      M=B;
      System.out.println( B + " es mayor que " + A);
    }
    System.out.println(" El resultado es " + M );
  }
}
