import java.util.Arrays;
public class ArrayExploration {

    public static void main(String[] args) {
        
        int [][] array = {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
        int [][] secondArray = {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
        int [][] thirdArray =new int[array.length][array[0].length];
        for (int count=0;count<array.length;count++){
            for (int index =0;index<array[0].length;index++){

                thirdArray [count][index] = array[count][index]+secondArray[count][index];

            }
        }

            for (int element=0;element<thirdArray.length;element++){

                    for(int position=0;position<thirdArray[0].length;position++){

                        System.out.print(thirdArray[element][position]+" ");
                    }
                    System.out.println();
            }


    }
}