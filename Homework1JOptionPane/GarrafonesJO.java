import javax.swing.JOptionPane;
public class GarrafonesJO{
  public static void main (String [] args){

    double L= Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad de litros"));
    double PG = Double.parseDouble(JOptionPane.showInputDialog(null,"precio por galon"));
    double GAL=(L/3.785);
    JOptionPane.showMessageDialog(null, "Ganancia por la entrega de leche: ");
    double TG = Double.parseDouble(JOptionPane.showInputDialog(null));
    double GA=(PG*GAL);
    JOptionPane.showMessageDialog(null, "Ganancia total en el dia" + GA);

  }
}
