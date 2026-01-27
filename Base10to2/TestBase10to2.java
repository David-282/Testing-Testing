import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



     public class TestBase10to2{



         @Test
     public void testMethodExist(){

     Assertions.assertNotNull(Base10to2.numberConverter(5));
     }


     
      @Test
     public void testMethodConvertCorrectly(){
 
     Assertions.assertEquals("1010",Base10to2.numberConverter(10));
     }


     @Test
     public void testMethodWorkOnNegativeNumbers(){
     Assertions.assertEquals("101",Base10to2.numberConverter(-5));
     }



     @Test
     public void testMethodGivesZero(){
     Assertions.assertEquals("0",Base10to2.numberConverter(0));
     }




          @Test
     public void testMethodWithHighNumber(){
     Assertions.assertEquals("1100100",Base10to2.numberConverter(100));
     }


   





}
