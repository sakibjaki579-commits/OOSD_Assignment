/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author sakibjaki579
 */
public class EnginePart extends StockItem {

    private final String engineType;

    public EnginePart(String stockCode, int quantity, double price, String engineType) {
        super(stockCode, quantity, price);
        this.engineType = engineType;
    }

    @Override
    public String getStockName() {
        return "Engine Part";
    }

    @Override
    public String getStockDescription() {
        return "Engine Filter";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEngine Type: " + engineType + "\n";
    }
}