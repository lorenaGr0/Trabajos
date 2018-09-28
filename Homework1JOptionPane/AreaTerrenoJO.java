import javax.swing.JOptionPane;
public class AreaTerrenoJO{
  public static void main (String[]args){

    int B,A,AT,AR,aT,bT, Area;
    B=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la base"));
    A=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la altura"));
    AR=B*A;
    JOptionPane.showMessageDialog(null, " EL area del rectangulo es:" + AR );
    bT= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la base"));
    aT=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la altura"));
    AT=(aT*bT)/2;
    JOptionPane.showMessageDialog(null, "El area del tiangulo es: " + AT );
    Area= AT+AR;
    JOptionPane.showMessageDialog(null, "El area del terreno es" + Area);
}
}
