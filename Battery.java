/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author sakibjaki579
 */
public class Battery extends StockItem {

    private int warrantyYears;

    public Battery(String stockCode, int quantity, double price, int warrantyYears) {
        super(stockCode, quantity, price);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getStockName() {
        return "Battery";
    }

    @Override
    public String getStockDescription() {
        return "Car Battery";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWarranty Years: " + warrantyYears + "\n";
    }
}