import javax.swing.JOptionPane;
public class Mayor3NumJO{
  public static void main (String [] args){

    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer numero"));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo numero"));
    int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tercer numero"));
    int m;
    if ( a > c){
      m=a;
    }else{
      m=c;
    }if ( c > b ){
      m=b;
    }else{
      m=c;
  }
  JOptionPane.showMessageDialog(null, " El resultado es " + m );
}
}
