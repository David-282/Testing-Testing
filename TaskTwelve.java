import java.util.Arrays;
public class TaskTwelve{



     public static int [] evenOddIndicesSwapping (int [] numbers){

                        int swap = 0;
//          for (int count =0; count<numbers.length; count++){

               for(int index =0; index<numbers.length;index++){
               
                    if (index%2!=0){
          swap= numbers[index];  
          numbers[index] = numbers[index-1];
          numbers[index-1]= swap;       
    }
           
   }

//                   System.out.println(Arrays.toString(numbers));
          return numbers;    









} 
     
          }











