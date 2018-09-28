import javax.swing.JOptionPane;
public class BanquetesJO{
  public static void main (String []args){

    int np = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de personas"));
    double tot = Double.parseDouble(JOptionPane.showInputDialog(null));
    if (np > 300 ){
      tot= np*75;
    }
    if (tot > 200){
      tot = np* 85;
    }else{
      tot =np* 95;
    }
    JOptionPane.showMessageDialog(null,"El total es: " + tot );
    }
  }
