import java.out.Scanner;
 public class ComputeBMI{
   public static void main(String[]args){
     Scanner input = new Scanner (System.in);
     final double KILOGRAMS_PER_POUND= 0.453592;
     final double METERS_PER_INCH =0.0254;

     System.out.println("Enter weight in pounds: ");
     double weight = input.nextDouble();

     System.out.println("Enter height in inches");
     double height = input.nextDouble();

     double weightInKilogrms = weight * KILOGRAMS_PER_POUND;
     double heightInMeters = height * METERS_PER_INCH;
     



   }
 }
