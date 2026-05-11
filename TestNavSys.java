/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author sakibjaki579
 */
public class TestNavSys {
    
    public static void main(String[] args) {

        // Step 1: Create object
        NavSys nav = new NavSys("NS101", 10, 99.99);

        // Step 2: Display initial details
        System.out.println("Initial Item:");
        System.out.println(nav);

        // Step 3: Add stock
        nav.addStock(10);
        System.out.println("After adding stock:");
        System.out.println(nav);

        // Step 4: Sell stock
        nav.sellStock(2);
        System.out.println("After selling stock:");
        System.out.println(nav);

        // Step 5: Update price
        nav.setPrice(100.99);
        System.out.println("After updating price:");
        System.out.println(nav);
        
        // Invalid add stock
        nav.addStock(0);
        System.out.println("Error: Invalid stock");
        
        boolean result = nav.sellStock(50);
        if (result == false){
                System.out.println("Cannot sell more than available stock");

        }

    }
}
    

