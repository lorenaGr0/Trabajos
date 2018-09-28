import javax.swing.JOptionPane;
 public class SueldoTrabajadorJO {
  public static void main (String[] args) {

  double HT = Double.parseDouble(JOptionPane.showInputDialog(null,"Horas trabajadas"));
  double PH= Double.parseDouble(JOptionPane.showInputDialog(null,"Pago por horas"));
  double SS=HT*PH;
  JOptionPane.showMessageDialog(null,"Sueldo semanal del trabajador: " + SS);
}
}
