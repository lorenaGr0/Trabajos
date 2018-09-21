import java.util.Scanner;
public class Mayor3Num{
  public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("ingrese el primer numero: ");
    int a = input.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int b = input.nextInt();
    System.out.println("Ingrese el tercer numero: ");
    int c = input.nextInt();
    int m;
    if ( a > c){
      m=a;
    }else{
      m=c;
    }if ( c > b ){
      m=b;
    }else{
      m=c;
  }
  System.out.println(" El resultado es " + m );
}
}
