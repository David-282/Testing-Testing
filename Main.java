import java.util.Arrays;     
public class Main{
     
     public static void main(String ... args){

     int [] scores = new int [10];

     int [] numbers = {1,100,3,4,5,6,7};

//     int [] result = TaskOne.fillUpArray(scores);
//     System.out.print(Arrays.toString(result));

//        TaskTwo.printArrayVertically(scores);
//        TaskThree.printArrayHorizontally(scores);
//          int [] results = TaskFour.evenIndexPrinting(numbers);
//          int [] results = TaskFive.oddIndexPrinting(numbers);
//          int sumOfEven = TaskSix.summingevenIndex(numbers);
//          int sumOfOdd = TaskSeven.summingOddIndex(numbers);
//          int MinimumOfEvenIndex = TaskEight.evenIndexMinimum(numbers);
//          int MinimumOfOddIndex = TaskNine.oddIndexMinimum(numbers);
//          int MaxminimumOfEvenIndex =TaskTen.evenIndexMaximum(numbers);
//            int MaxminimumOfOddIndex = TaskEleven.oddIndexMaximum(numbers);
            int []Sorting = TaskTwelve.evenOddIndicesSwapping(numbers);
           System.out.println(Arrays.toString(Sorting));


}



}
