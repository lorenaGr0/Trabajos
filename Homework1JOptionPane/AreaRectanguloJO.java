import javax.swing.JOptionPane;
public class AreaRectanguloJO{
  public static void main (String[]args){
    int B, A, Area;
    B=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la base"));
    A=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la altura"));
    Area = B * A;
    JOptionPane.showMessageDialog(null, "El area es: " + Area);
  }
}
