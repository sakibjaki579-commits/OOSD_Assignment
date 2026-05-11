/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Assignment;

public class TestPolymorphism {

    public static void itemInstance(StockItem s) {

        System.out.println("Printing item stock information:");
        System.out.println(s);

        s.addStock(5);
        System.out.println("After adding stock:");
        System.out.println(s);

        s.sellStock(2);
        System.out.println("After selling stock:");
        System.out.println(s);

        s.setPrice(150.00);
        System.out.println("After changing price:");
        System.out.println(s);
    }

    public static void main(String[] args) {

        StockItem[] items = new StockItem[4];

        items[0] = new NavSys("NS101", 10, 99.99);

        items[1] = new Battery("B101", 15, 120.00, 5);

        items[2] = new Wheel("W101", 20, 200.00, "Alloy");

        items[3] = new EnginePart("E101", 8, 180.00, "Diesel");

        for (StockItem s : items) {
            itemInstance(s);
        }
    }
}