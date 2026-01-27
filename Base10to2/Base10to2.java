public class Base10to2{

     public static void main (String...args){

     int number =10; 

     System.out.println(numberConverter(number));


}

     public static String numberConverter (int number){
          if  (number==0){
               return "0";
               }  
          
            int loopLenght = Math.abs(number);
          int  originalNumber =Math.abs(number);
//          System.out.print(originalNumber);
          int division=0;
          int multiplication=0;
          String convertedNum="";
          int subtraction=0;
     for (int count = 0; count<loopLenght; count++){
          
     division = originalNumber/2;
     multiplication= division*2;
     subtraction = originalNumber-multiplication;

     convertedNum+= subtraction;
          if (division==0){
//     convertedNum+=1;
     break;
}
     
     originalNumber=division;
      

               }

          String reversed ="";
          for(int index=convertedNum.length()-1;index>=0;index--){
     
     reversed+=convertedNum.charAt(index);
          }    

          System.out.println("THE CONVERTED NUMBER IS --> " + reversed);

          return reversed;
          }


     }
