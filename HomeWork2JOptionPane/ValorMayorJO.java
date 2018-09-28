
import javax.swing.JOptionPane;

public class ValorMayorJO{
  public static void main (String [] args){


    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a value"));

    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter anothe value"));
    int m;
    if ( a > b){
      m=a;
    }else{
      m=b;
    }
    JOptionPane.showMessageDialog(null, " El resultado es " + m );
  }
}
