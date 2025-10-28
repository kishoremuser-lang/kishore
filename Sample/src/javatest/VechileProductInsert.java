package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

public class VechileProductsInsert {
	
	public static List<ProductsData> insertInoffice(){
        ProductsData car = new ProductsData();
        
        car.setId(1);
        car.setTitle("SportModel");
        car.setDescription(" German luxury automobile manufacturer, part of the Volkswagen Group, known for its performance and technology.");
        car.setCategory("Vehicle");
        car.setPrice(10000000);
        car.setDiscountPercentage(6.0);
        car.setRating(4.8);
        car.setStock(20);
        car.setBrand("Audi");
        car.setWeight(1200000);
        car.setWarrantyInformation("2 Year Warranty");
        car.setShippingInformation("Ships in 8-9 business days");
        car.setAvailabilityStatus("In Stock");
        car.setReturnPolicy("no");
        car.setMinimumOrderQuantity(1);
        
        
        ProductsData bike = new ProductsData();
        bike.setId(2);
        bike.setTitle("Street bikes");
        bike.setDescription("Designed for pavement use, including cruisers, sportbikes, scooters, and mopeds.");
        bike.setCategory("Vehicle");
        bike.setPrice(190000);
        bike.setDiscountPercentage(4.0);
        bike.setRating(4.9);
        bike.setStock(10);
        bike.setBrand("Yahama");
        bike.setWeight(90000);
        bike.setWarrantyInformation("5 Year Warranty");
        bike.setShippingInformation("Ships in 5-6 business days");
        bike.setAvailabilityStatus("In Stock");
        bike.setReturnPolicy("NO");
        bike.setMinimumOrderQuantity(1);
        
        
        ProductsData cycle = new ProductsData();
        cycle.setId(3);
        cycle.setTitle("Gear cycle");
        cycle.setDescription("adjust pedaling resistance, making it easier to climb hills (lower gears) or go faster on flat ground higher gears");
        cycle.setCategory("Vehicle");
        cycle.setPrice(50000);
        cycle.setDiscountPercentage(2.0);
        cycle.setRating(4.5);
        cycle.setStock(15);
        cycle.setBrand("Hero");
        cycle.setWeight(60000);
        cycle.setWarrantyInformation("2 Year Warranty");
        cycle.setShippingInformation("Ships in 4-5 business days");
        cycle.setAvailabilityStatus("In Stock");
        cycle.setReturnPolicy("No");
        cycle.setMinimumOrderQuantity(1);
        
        return Arrays.asList(car, bike, cycle);
        
        public static void insertData(List<ProductsData> ListProducts){
            try (Connection conn = dbConnection.getConnection()) {
                PreparedStatement ps = conn.prepareStatement(
                        "INSERT INTO products_data(title, description, category, price, discount_percentage, rating, stock, brand, sku, weight, warranty_information, shipping_information, availability_status, return_policy, minimum_order_quantity, thumbnail) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                );
                
                
                for (ProductsData product : ListProducts) {
                    ps.setString(1, product.getTitle());
                    ps.setString(2, product.getDescription());
                    ps.setString(3, product.getCategory());
                    ps.setDouble(4, product.getPrice());
                    ps.setDouble(5, product.getDiscountPercentage());
                    ps.setDouble(6, product.getRating());
                    ps.setInt(7, product.getStock());
                    ps.setString(8, product.getBrand());
                    ps.setDouble(9, product.getWeight());
                    ps.setString(10, product.getWarrantyInformation());
                    ps.setString(11, product.getShippingInformation());
                    ps.setString(12, product.getAvailabilityStatus());
                    ps.setString(13, product.getReturnPolicy());
                    ps.setInt(14, product.getMinimumOrderQuantity());
                    ps.addBatch();
                }
                ps.executeBatch();
                System.out.println("Vehicle batch insert completed successfully!");
            } catch (Exception e) {
                e.printStackTrace();
                
                
    }
       
        
        
        
        
        
        
	}

}
