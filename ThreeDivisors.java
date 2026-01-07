import java.util.Scanner;
public class ThreeDivisors{
    public static void main(String...args){
        Scanner input = new Scanner(System.in);

         System.out.print("Input a number: ");
         int number = input.nextInt();
         int initialCount = 0;
         int finalCount =0;
         for(int count = 1;count<=number;count++){
            
            for(int index=1;index<= count;index++){
                if (count%index==0){

                    initialCount+=1;
                }
               
            }

            if (initialCount==3) {
                finalCount+=1;
            }
            initialCount=0;
         }
         System.out.println(finalCount);
    }
}