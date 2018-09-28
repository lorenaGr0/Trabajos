import javax.swing.JOptionPane;
public class ChimeFonJO{
  public static void main (String [] args){
    Double pag;
    Double imp;
    Double tot;
    pag = 0.0;
    imp = 0.0;
    int ti= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa los minutos de la llamada"));
    if (ti <= 5){
      pag = ti * 1.0;
    }else if (ti > 5 && ti <= 8){
      pag = ((ti - 5)* .80) + 5 ;
    }else if (ti> 8 && ti <= 10){
      pag = ((ti - 8) * .70) + 7.4;
    }else if (ti > 10){
      pag = ((ti - 8) * .70) * 7.4;
    }
    System.out.println("Ingresa el dia de la llamada");
    String di = (JOptionPane.showInputDialog(null,"Ingresa el dia de la llamada"));
    if (di.equalsIgnoreCase("Domingo")){
      imp =( pag = .03);
    }else{
      String tu = (JOptionPane.showInputDialog(null,"Ingresa el turno: Matutino o Vespertino"));
      if (tu.equalsIgnoreCase("Matutino")){
        imp = (pag * .15);
      }else if (tu.equalsIgnoreCase("Vespertino")){
        imp = (pag * .10);
      }
    }
    tot = imp +  pag;
    JOptionPane.showMessageDialog(null, "El pago es : " + pag);
    JOptionPane.showMessageDialog( null, "El importe es : " + imp);
    JOptionPane.showMessageDialog(null, "Pago total : " + tot);
  }
}
