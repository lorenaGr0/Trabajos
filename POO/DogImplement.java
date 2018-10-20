import javax.swing.JOptionPane;
public class DogImplement{
    public static void main (String []args){
      Dog fido = new Dog();
      fido.color = "black";
      fido.eyeColors = "blue";
      fido.height = 0.50d;
      fido.weight = 30.0d;
      Dog chilaquil = new Dog();
      chilaquil.color = "brown";
      chilaquil.eyeColors = "green";
      chilaquil.height = 0.78d;
      chilaquil.weight = 25.0d;
      JOptionPane.showMessageDialog(null, "Fido es de color :" + fido.color);
      JOptionPane.showMessageDialog(null, "Chilaquil es de color :" + chilaquil.color);
      //System.out.println (fido.site());
      fido.layDown("Mi nombre es fido");
      fido.sleep();
    }
}
