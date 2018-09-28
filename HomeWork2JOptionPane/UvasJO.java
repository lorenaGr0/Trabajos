
import javax.swing.JOptionPane;

public class UvasJO{
  public static void main ( String [] args){

    double p;

    int k= Integer.parseInt(JOptionPane.showInputDialog(null,"Kilogramos de produccion"));
    String ti = (JOptionPane.showInputDialog(null,"Tipo de uva : a o b"));
    if ( ti.equalsIgnoreCase ("A")){

      int ta = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de uva : 1 o 2"));
      if (ta ==1){
        p = k *.20;
        JOptionPane.showMessageDialog(null, "Ganancia obtenida : " + p);
      }else if (ta ==2){
      p=k* .30;
      JOptionPane.showMessageDialog(null, "Ganancia  obtenida : " + p);
    }else if(ti.equalsIgnoreCase("B")){
      JOptionPane.showMessageDialog(null, "Ingrese el tamaño de la uva: 1 o 2");
      if (ta==1){
        p = k* .30;
      JOptionPane.showMessageDialog(null, "Ganancia obtenida : " + p);
      }else if (ta == 2){
        p= k * .50;
        JOptionPane.showMessageDialog(null, "Ganancia obtenida : " + p);
      }
      }
    }
}
}
