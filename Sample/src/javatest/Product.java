package javatest;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	// Product class
	 private int id;
	    private String name;
	    private double price;
	    
	    // Constructor
	     public Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }
	     
	  // Getters
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public double getPrice() { return price; }
	    
	 // toString method for printing
	    @Override
	    public String toString() {
	        return "Product ID: " + id + ", Name: " + name + ", Price: ₹" + price;
	    }
	    
	 // Main class
	    public class ProductListExample {
	        public static void main(String[] args) {

	            // Create a list of products
	            List<Product> products = new ArrayList<>();

	            // Add products
	            products.add(new Product(1, "Laptop", 65000.0));
	            products.add(new Product(2, "Smartphone", 25000.0));
	            products.add(new Product(3, "Headphones", 2000.0));
	            products.add(new Product(4, "Keyboard", 1200.0));
	            products.add(new Product(5, "Mouse", 800.0));

	            // Display the list of products
	            System.out.println("=== Product List ===");
	            for (Product p : products) {
	                System.out.println(p);
	            }
	        }
	    }


}
