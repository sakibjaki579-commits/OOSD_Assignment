/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author sakibjaki579
 */
public class Wheel extends StockItem {

    private final String wheelType;

    public Wheel(String stockCode, int quantity, double price, String wheelType) {
        super(stockCode, quantity, price);
        this.wheelType = wheelType;
    }

    @Override
    public String getStockName() {
        return "Wheel";
    }

    @Override
    public String getStockDescription() {
        return "Alloy Wheel";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWheel Type: " + wheelType + "\n";
    }
}