import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



     public class MFDTest{

//              @Test
//     public void testMethodFunctions(){
//
//     Assertions.assertNotNull(MultiFuelDispenser.buyingPetroleum("liter ",750.00,"petrol"));
//     }              
//     
      @Test
     public void testAmountOrLiterWorks(){
     String actual="liter"; 
     Assertions.assertEquals(true,MultiFuelDispenser.isValidateAmountOrLiter(actual));
     }

      @Test
     public void testAmountOrLiterIsNotANumber(){
     String actual="100"; 
     Assertions.assertEquals(false,MultiFuelDispenser.isValidateAmountOrLiter(actual));
     }

      @Test
     public void testAmountIsTrue(){
     String actual="    amount      "; 
     Assertions.assertEquals(true,MultiFuelDispenser.isValidateAmountOrLiter(actual));
     }

 
         @Test
     public void testAmountIsNotMoreThanMaxPrice(){

     Assertions.assertEquals(false,MultiFuelDispenser.isValidateAmount(100000,"petrol",560));
     }

         @Test
     public void testMethodExist(){

     Assertions.assertNotNull(MultiFuelDispenser.isValidateLiter(59,560));
     }

           @Test
     public void testLiterIsNotLessThan1(){

     Assertions.assertEquals(false,MultiFuelDispenser.isValidateLiter(59,560));
     }
            
  
//               @Test
//     public void testBuyingPetroluem(){
//      double price =650.00;
//      String amountOrLiter= "amount";
//      String fuelType = "petrol";
//      double amount = 1300;
//      double liters =0.0;
//      double totalPurchase =0.0;
//
//     Assertions.assertEquals((amountOrLiter="amount",price=650,fuelType = "petrol",liters = 2.00,totalPurchase= 1300.00),MultiFuelDispenser.buyingPetroleum(amountOrLiter,price,fuelType));
//     }
   

  
}
