import java.util.Scanner;
public class ModistaTela {
  public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Cantidad de metros de tela");
      double CM =input.nextDouble();
      double PG;
      PG=CM/0.0254;
      System.out.println("Cantidad de pulgadas pedidas: " + PG);
  }
}
