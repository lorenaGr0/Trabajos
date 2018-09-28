import javax.swing.JOptionPane;
public class ForLoop{
  public static void main (String [] args){
   /*for (inicializar var, condicion, incremento){

   }*/

  int pregunta;

     do{
         int tabla = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
          String salida ="";
       for (int i=0; i < 9; i++ ){
         salida += tabla + " x " + (i + 1) + "=" + (i + 1) * tabla+ "\n";
       }
      JOptionPane.showMessageDialog(null, salida);
       pregunta = Integer.parseInt(JOptionPane.showInputDialog("Deseas ver otra tabla escribe 0 ?"));
   }while (pregunta != 0);






}
}
