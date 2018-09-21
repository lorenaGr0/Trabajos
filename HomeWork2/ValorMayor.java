import java.util.Scanner;
public class ValorMayor{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a value");
    int a = input.nextInt();
    System.out.println("Enter anothe value");
    int b = input.nextInt();
    int m;
    if ( a > b){
      m=a;
    }else{
      m=b;
    }
    System.out.println(" El resultado es " + m );
  }
}
