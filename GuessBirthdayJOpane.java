import java.util.Scanner;
import javax.swing.JOptionPane;
public class GuessBirthdayJOpane{
  public static void main (String [] args){
    String set1 = "1 3 5 7 \n" + "9 11 13 15 \n" +  "17 19 21 23 \n" + "25 27 29 31 \n";
    String set2 = "2 3 6 7 \n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31\n ";
    String set3 = " 4 5 6 7\n" + " 12 13 14 15\n" + "20 21 22 23\n" + " 28 29 30 31 \n";
    String set4 = " 8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n " + " 28 29 30 31\n";
    String set5= "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31\n";

    int day= 0;
    int answer = JOptionPane.showConfirmDialog(null, "Is your birthday in set1?? \n" + set1);

    if (answer == JOptionPane.YES_OPTION){
    //(answer == 1){
      day  += 1;
    }
    answer = JOptionPane.showConfirmDialog(null, "Is your birthday in set2?? \n" + set2);


    if (answer == JOptionPane.YES_OPTION){
    //(answer == 1){
      day += 2;
    }
    answer = JOptionPane.showConfirmDialog(null, "Is your birthday in set3?? \n" + set3);

      if (answer == JOptionPane.YES_OPTION){
    //(answer == 1) {
      day += 4;
    }
    answer = JOptionPane.showConfirmDialog(null, "Is your birthday in set4?? \n" + set4);

    if (answer == JOptionPane.YES_OPTION){
    //(answer == 1) {
      day += 8;
    }
    answer = JOptionPane.showConfirmDialog(null, "Is your birthday in set5?? \n" + set5);


    if (answer == JOptionPane.YES_OPTION){
    //if (answer == 1) {
      day += 16;
    }
    JOptionPane.showConfirmDialog(null, " \n Your birthday is " + day);

  }
}
