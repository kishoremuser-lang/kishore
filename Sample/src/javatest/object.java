package javatest;

public class object {
	
	String color;
    String model;
    int year;
    
    // Method (function / behavior)
    
    void start() {
        System.out.println(model + " is starting..."); }
    
    void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
    
    public class Main {
        public static void main(String[] args) {
       
        	// Create an object of Car class
        	Car myCar = new Car();
        	
        	// Set object values
        	myCar.color = "Red";
            myCar.model = "Tesla Model S";
            myCar.year = 2025;
            
         // Call methods
            myCar.start();
            myCar.displayDetails();
            
         // Create another object
            Car secondCar = new Car();
            secondCar.color = "Blue";
            secondCar.model = "BMW X5";
            secondCar.year = 2022;

            secondCar.start();
            secondCar.displayDetails();
            
        }
            
        }
        


}
