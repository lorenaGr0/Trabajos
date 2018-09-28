import javax.swing.JOptionPane;
public class LapicesJO{
  public static void main (String [] args){

    int x= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de lapices"));
    double pag;
    if ( x >= 1000){
      pag= x * 0.85;
  } else{
      pag= x * 0.90;
    }
    JOptionPane.showMessageDialog(null, "Pago a realizar " + pag);
    }
  }
