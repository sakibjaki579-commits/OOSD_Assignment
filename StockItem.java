/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author sakibjaki579
 */
public class StockItem {
    
    private final String stockCode;
    private int quantity;
    private double price;
    public StockItem(String stockCode, int quantity, double price){
        this.stockCode = stockCode;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getStockCode() {
        return stockCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    public String getStockName() {
        return "Unknown Stock Name";
    }

    public String getStockDescription() {
        return "Unknown Stock Description";
    }

    // Add stock
    public void addStock(int amount) {
        if (amount < 1 || quantity + amount > 100) {
            System.out.println("Invalid stock amount");
        } else {
            quantity += amount;
        }
    }

    // Sell stock
    public boolean sellStock(int amount) {
        if (amount < 1) {
            System.out.println("Invalid amount");
            return false;
        } else if (amount <= quantity) {
            quantity -= amount;
            return true;
        } else {
            return false;
        }
    }

    // VAT
    public double getVAT() {
        return 17.5;
    }

    public double getPriceWithVAT() {
        return price + (price * getVAT() / 100);
    }

    @Override
    public String toString() {
        return "Stock Type: " + getStockName() +
                "\nDescription: " + getStockDescription() +
                "\nStock Code: " + stockCode +
                "\nPrice Without VAT: " + price +
                "\nPrice With VAT: " + getPriceWithVAT() +
                "\nTotal unit in stock: " + quantity + "\n";
    }
}
