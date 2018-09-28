import javax.swing.JOptionPane;
public class ConaguaJO {
  public static void main (String [] args){

    double A= Double.parseDouble(JOptionPane.showInputDialog(null,"Altura de la alberca"));
    double L =Double.parseDouble(JOptionPane.showInputDialog(null,"Largo de la alberca"));
    double N =Double.parseDouble(JOptionPane.showInputDialog(null,"Ancho de la alberca"));
    JOptionPane.showMessageDialog(null,"ingrese el costo del metro cubico de agua: ");
    double CM=Double.parseDouble(JOptionPane.showInputDialog(null));
      double V=(A*L*N);
    double PAG= V*CM;
    JOptionPane.showMessageDialog(null, "Pago total de los metros cubicos consumidos: " + PAG);
  }
}
