import java.util.Scanner;
 public class Valores{
  public static void main (String []args){
    Scanner input = new Scanner (System.in);
    int M;
    System.out.println("Enter a value");
    int A = input.nextInt();
    System.out.println("Enter anothe value");
    int B = input.nextInt();
    if ( A > B)
      System.out.println( A + "es mayor que" + B);
      else
      System.out.println( B + " es mayor que " + A);
      System.out.println(" El resultado es " + M );

  }
}
