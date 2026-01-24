import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MultiFuelDispenser{
    static Scanner input = new Scanner(System.in);
     static double price =0.0;
     static String fuelType = "";
     static double amount = 0.0;
     static double liters =0.0;
     static double totalPurchase =0.0;
     static ArrayList<String> transactionList = new ArrayList<>();
    
      public static void main(String[] args) {
     
      

        int sentinel = -1;
        
  
        while(sentinel !=0){
            System.out.println();
        System.out.println("Multi-Fuel Dispenser");   
        System.out.println("Available Petroleum Products");
        System.out.println("\t1.Buy Petroleum Products");
        System.out.println("\t2.Show Transaction History");
        System.out.println("\t0.Exit the App.");
        System.out.println();
        System.out.println("Enter Operation: ");
        int operation = input.nextInt();
            switch (operation){
                case 1-> {
                    System.out.println("Available Petroluem");
                    System.out.println("\t1.\tPetrol   =>  650/Liter");
                    System.out.println("\t2.\tDiesel   =>  720/Liter");
                    System.out.println("\t3.\tKerosene =>  650/Liter");
                    System.out.println("\t4.\tGas      =>  480/Liter");
                    System.out.println("\t0.\tExit");
                    System.out.println("Enter operation: ");
                    int choice = input.nextInt();
                                input.nextLine();

                    switch (choice){
                        case 1->{price =650.00;
                            fuelType = "Petrol";    
                            System.out.print("Liter or Amount: ");
                            String amountOrLiter = input.nextLine();     
                            buyingPetroleum(amountOrLiter, price,fuelType);
                            printReceipt (fuelType,liters,totalPurchase);
                            
                        }                       
                        case 2->{price =720.00;
                            fuelType = "Diesel";    
                            System.out.print("Liter or Amount: ");
                            String amountOrLiter = input.nextLine();  
                            buyingPetroleum(amountOrLiter, price,fuelType);
                                                        printReceipt (fuelType,liters,totalPurchase);


                        }             
                        case 3->{price =650.00;
                            fuelType = "Kerosene";    
                            System.out.print("Liter or Amount: ");
                            String amountOrLiter = input.nextLine();  
                             buyingPetroleum(amountOrLiter, price,fuelType);
                                                         printReceipt (fuelType,liters,totalPurchase);


                        }               
                        case 4->{price = 480.00;
                            fuelType = "Gas";    
                            System.out.print("Liter or Amount: ");
                            String amountOrLiter = input.nextLine();  
                            buyingPetroleum(amountOrLiter, price,fuelType);
                                                        printReceipt (fuelType,liters,totalPurchase);

 
                        }  
                        case 0->{
                            // System.out.println("Thank you for Patronizing us, Have a nice day.");
                            break;  
                        }  
                    default -> {
                            System.out.println("Enter a valid Input !!!");
                        }            
                    }
                }
            

                case 2 -> {
                    System.out.println("Transaction History");
                    System.out.println("=".repeat(50));
                         if (transactionList.isEmpty()){
                    System.out.println("Transaction History is Empty ");
                    }
                         else{
                       for(String record:transactionList){
                      System.out.println(record);               
                         }
//                      for(int record:transactionList.size()){
//                      System.out.println(transactionList.get(record));               
//                         }
                         
                    }
                }
                case 0 ->{
                        System.out.println("Thank you for Patronizing us, Have a nice day.");
                        sentinel =0;  
                }

                default -> {
                    System.out.println("Enter a Valid Input !!!");
                }

            }

        }
    
    
    }

     public static  boolean isValidateAmountOrLiter (String amountOrLiter) {

    if (amountOrLiter.trim().isEmpty()) {
        amountOrLiter = input.nextLine();
        return false;
    }

    String validatedResult = amountOrLiter.trim();

    if(validatedResult.equalsIgnoreCase("amount") || validatedResult.equalsIgnoreCase ("liter")){

     return true;
          }

     return  false;
}
     
    public static boolean isValidateAmount (double amount, String fuelType, double price) {
    double MaxPrice = price*50;
     if (amount <=0){
          return false;
          }

     else if (amount >=price  && amount <= MaxPrice){

     return true;
          }
     return false;
}


     public static boolean isValidateLiter  (double liter, double price) {
     
     if (liter <=0){
        return false;
        }
     else if (liter >=1.00  && liter <= 50.00){
        return true;
        }
        return false;
}


public static void buyingPetroleum(String amountOrLiter,double price,String fuelType){ 

    while (true) {

        if (!isValidateAmountOrLiter(amountOrLiter)) {
            System.out.print("Enter a valid Input amount or liter: ");
            amountOrLiter = input.nextLine();  
            continue;
        }

        if ("amount".equalsIgnoreCase(amountOrLiter.trim())) {

            System.out.printf("How much %s are you buying (%.2f/L): ", fuelType, price);

            if (!input.hasNextDouble()) {
                System.out.println("Invalid Input");
                input.nextLine();
                continue;
            }

            double amount = input.nextDouble();
            input.nextLine();

            if (isValidateAmount(amount, fuelType, price)) {
                        totalPurchase = amount;
                        liters = totalPurchase / price;
                break;
            } else {
                System.out.println("Amount must be above a liter price or less than 50L !!!");
            }
        }

        else if ("liter".equalsIgnoreCase(amountOrLiter)) {

            System.out.printf("How many liters of %s are you buying(%.2f/L): ", fuelType, price);

            if (!input.hasNextDouble()) {
                System.out.println("Invalid Input: ");
                input.nextLine();
                continue;
            }

            liters = input.nextDouble();
            input.nextLine();

            if (isValidateLiter(liters, price)) {
                        totalPurchase = liters * price;
                    
                break;
            } else {
                System.out.println("Liter must be between 1-50L !!!");
            }
        }
    }
}



    public static void printReceipt (String fuelType, double liters, double totalPurchase){
        System.out.println();
        System.out.println("Customers Transaction Receipt");
        System.out.println("=".repeat(50));
        System.out.printf("=  Product: %s     %n", fuelType);
        System.out.printf("=  Amount:  $ %.3f  %n", totalPurchase);
        System.out.printf("=  Liters:  %.3fL  %n", liters);
        System.out.println("Thank you For your Patronage.");
        System.out.println("=".repeat(50));
        System.out.println("Saving Transaction History...");
        System.out.println();


        transactionHistory();
    }


    public static void transactionHistory (){
          LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
        String formattedTime = now.format(formatter);

        String history = String.format(" Date: %s | Product: %-12s | Amount: $%-12.4f | Liters: %.2fL", formattedTime, fuelType,totalPurchase, liters);
        transactionList.add(history);
        
    }

}







