import javax.swing.JOptionPane;
public class AreaFiguraJO {
  public static void main(String [] args ){

      double R = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base"));
      double H = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la hipotenusa"));
      double PI = 3.1416;
      double C = (H*H)-(R*R);
      Math.sqrt(C);
      double AT;
      AT=(2*(R*C))/2;
      double AC;
      AC= (PI*(R*R))/2;
      double Area;
      Area=AT+AC;
      JOptionPane.showMessageDialog(null,"El area de la figura es: " + Area);
  }
}
