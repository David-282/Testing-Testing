import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MiniParkingSystemTesting{

     int carLot[] = new int [20]; 
     

//
//     @Test
//     void removedAParkedCars (){
//       MiniParkingSystem.parkCar(carLot);
//   MiniParkingSystem.removeCar(1,carLot);
//          
//          assertArrayEquals(expected,aray);
//               
//
//}
//
     @Test
     void removeMoreThanTheCarLot (){
      int[] arr   = {1, 1, 1, 1};
          
          int[] actual = MiniParkingSystem.removeCar(3,arr);
     assertArrayEquals({1,1,0,1},actual);
}

} 


     
//        int[] actual   = {1, 1, 1, 1};
//          MiniParkingSystem.removeCar(1,actual);
//          int[] expected = {0,1, 1, 1};
//     assertArrayEquals(expected,actual);
