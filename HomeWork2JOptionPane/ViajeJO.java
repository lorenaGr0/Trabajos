import javax.swing.JOptionPane;
public class ViajeJO{
  public static void main (String [] args){

    int na = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de alumnos que realizan el viaje"));
    double pa =Double.parseDouble(JOptionPane.showInputDialog(null));
    double  tot = Double.parseDouble(JOptionPane.showInputDialog(null));
    if ( na >= 100){
      pa = 65.0;
    }
     if (na >= 50){
       pa =70.0;
    }
    if (na >=95.0){
      pa= 95.0;
    pa = 4000 / na;
    }else{
      tot = pa*na;
    }
    JOptionPane.showMessageDialog(null, "El pago individual es : " + pa);
    JOptionPane.showMessageDialog(null, "El pago total es : " + tot);
  }
}
