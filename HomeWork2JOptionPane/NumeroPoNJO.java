import javax.swing.JOptionPane;
public class NumeroPoNJO{
  public static void main (String [] args){

    int NUM = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
    if ( NUM ==0){
      JOptionPane.showMessageDialog(null, " El numero " + NUM + " Es positivo " );
    }else{
        JOptionPane.showMessageDialog(null, " El numero " + NUM + " Es negativo " );
    }

  }
  }
