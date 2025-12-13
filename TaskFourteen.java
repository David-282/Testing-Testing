import java.util.Scanner;
public class TaskFourteen{
public static void main(String[]args){

     Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = input.nextInt();
     int factorial=1;
for(int count=number;count>=1;count--){
      
     factorial=factorial*count;


}


               System.out.println(factorial);
}
}
