import javax.swing.JOptionPane;
public class TrajeJO{
  public static void main (String [] args){

    double ct = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el costo del traje: "));
    double de,pf;
    if (ct > 2500){
      de = ct * 0.15;
    }else{
      de = ct * 0.08;
    }
     pf = ct - de;
     JOptionPane.showMessageDialog(null, "El precio final es : " + pf );
      JOptionPane.showMessageDialog(null, "El descuento es : " + de );
  }
}
