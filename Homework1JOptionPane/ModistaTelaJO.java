import javax.swing.JOptionPane;
public class ModistaTelaJO {
  public static void main (String [] args) {
      double CM =Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad de metros de tela"));
      double PG;
      PG=CM/0.0254;
      JOptionPane.showMessageDialog(null,"Cantidad de pulgadas pedidas: " + PG);
  }
}
