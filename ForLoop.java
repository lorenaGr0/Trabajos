import javax.swing.JOptionPane;
public class ForLoop{
  public static void main (String [] args){
   /*for (inicializar var, condicion, incremento){

   }*/
   int tabla;
   String salida ="";

     do{
         tabla = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
       for (int i=0; i < 9; i++ )
         salida += tabla + " x " + (i + 1) + "=" + (i + 1) * tabla+ "\n";
   }while (tabla != 0);
   
   JOptionPane.showMessageDialog(null, salida);
   /*int tabla= Integer.parseInt(JOptionPane.showInputDialog("Deseas ver otra tabla (s/n)?", tabla));*/


}
}
