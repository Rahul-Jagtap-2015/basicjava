package LearnJavaPackage;

class Vehicle {
 void start() {
     System.out.println("Vehicle started");
 }
}

class Car extends Vehicle {
 @Override
 void start() {
     System.out.println("Car started");
 }
 
 void drive() {
     System.out.println("Car is driving");
 }
}

public class Typecasting {
 public static void main(String[] args) {
     
     Vehicle vehicle1 = new Car();
     vehicle1.start();
               
     Vehicle vehicle2 = (Vehicle) new Car();
     vehicle2.start();
          
     if (vehicle1 instanceof Car)
     {
         Car car1 = (Car) vehicle1;
         car1.start();
         car1.drive();
     }
     
     Vehicle vehicle3 = new Vehicle();
     try
     {
         Car car2 = (Car) vehicle3; // Throws ClassCastException
         car2.drive();
     }
     catch (ClassCastException e)
     {
         System.out.println("Error: Can't downcast Vehicle to Car");
     }
 }
}
