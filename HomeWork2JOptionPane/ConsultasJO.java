import javax.swing.JOptionPane;
public class ConsultasJO{
  public static void main (String [] args){


    int nc =    Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de cita"));
    double cc, tot;
    if (nc <= 3){
      cc=200;
      tot=nc*cc;
    }
    if (nc <= 5){
      cc=150;
      tot= (nc-5 )*150+600;
    }
    if (nc<=8){
      cc=100;
      tot = ( nc - 5 *  100 + 900);
    }else{
      cc=50;
      tot= (nc - 8) * 50 + 1200;
    }
    JOptionPane.showMessageDialog(null, "El costo de la consulta es : " + cc);
    JOptionPane.showMessageDialog(null, "El costo del tratamiento es : " + tot);
  }
}
