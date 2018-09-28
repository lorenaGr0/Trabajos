import javax.swing.JOptionPane;
public class BancoPuebloJO{
  public static void main( String[] args){
     int TT = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el tipo de su tarjeta mayor o la que elija"));
     double LA = Double.parseDouble(JOptionPane.showInputDialog(null,"Indique el limite actual de credito"));
     double AC=0;
     if (TT == 1){
      AC=LA *.25;
      double NC= LA + AC;
     JOptionPane.showMessageDialog(null,"Su aumento es de: " + AC);
     JOptionPane.showMessageDialog(null,"Su nuevo limite es de: " + NC);
}
    if ( TT == 2){
      AC = LA * .35;
      double NC= LA + AC;
     JOptionPane.showMessageDialog( null, "Su aumento es de: " + AC);
     JOptionPane.showMessageDialog(null, "Su nuevo limite es de: " + NC);
    }
    if (TT==3){
      AC = LA * .40;
      double NC= LA + AC;
     JOptionPane.showMessageDialog(null, "Su aumento es de: " + AC);
     JOptionPane.showMessageDialog(null, "Su nuevo limite es de: " + NC);
    }
   if (TT >=4){
     AC = LA * .50;
     double NC= LA + AC;
    JOptionPane.showMessageDialog( null, "Su aumento es de: " + AC);
    JOptionPane.showMessageDialog(null,"Su nuevo limite es de: " + NC);
   }

  }
}
