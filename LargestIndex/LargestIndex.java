import java.util.Arrays;
public class LargestIndex{


     public static void main (String... args){
     
     int [][] numbers ={{2,3,4},{5,6,58,9},{3,4,2}};
     
     System.out.println(sumingIndexElements(numbers));
} 
     
     public static int sumingIndexElements (int [][]numbers){

          int []sumArray = new int [numbers.length];



     for(int count =0; count < numbers.length;count++){

               for(int index =0;index<numbers[count].length;index++){
                    
                    sumArray[count]+=numbers[count][index];         
           }          
     }

          int largest =0;
//     System.out.print(Arrays.toString(sumArray));

          for(int element =0; element< sumArray.length; element++){

               if (sumArray[element]>largest){

               largest = sumArray[element];
               }
          
          }
               return largest;
       }

   }
