import java.util.Scanner;

     public class SummingIntegers{
     public static void main(String[]args){

     Scanner key = new Scanner(System.in);

     System.out.print("Input any integer between 0 and 999: ");
     int integer = key.nextInt();
     int intOne = integer/100;
     int intTwo = (integer/10)%10;
     int intThree = integer%10;
     int intAddition = intOne + intTwo + intThree;

     if(integer > 999){
     System.out.println("Input integer between 0 and 999");}
     else{
     System.out.println("The sum of the inputed integer is: "+ intAddition);}
}
}
