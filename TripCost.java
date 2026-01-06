import java.util.Scanner;
     public class TripCost{
     public static void main(String[]args){
       Scanner key = new Scanner(System.in);
      
     System.out.print("Enter the distance covered: ");
     double distance = key.nextDouble();
     System.out.print("Enter miles coverd per gallon: ");
     double  milesCovered = key.nextDouble();
     System.out.print("Enter price per gallon: ");
     double price = key.nextDouble();

     double driveCost = (distance/milesCovered) * price;

     System.out.print("The cost of the trip will be $" + driveCost);
}
}
