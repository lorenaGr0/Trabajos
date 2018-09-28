import javax.swing.JOptionPane;
public class AreaCircunferenciaJOpane{
  public static void main (String[]args){
    double R, Area;
    R = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el radio de la circunferencia"));
    Area=  (3.1416*R*R);
    JOptionPane.showMessageDialog(null,"El area de la circunferencia es:"+Area);
}
}
