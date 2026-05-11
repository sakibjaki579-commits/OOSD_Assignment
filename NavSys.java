/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author sakibjaki579
 */
public class NavSys extends StockItem {
    public NavSys(String stockCode, int quantity, double price){
        super(stockCode, quantity, price);
    }
    @Override
    public String getStockName(){
      return "Navigation system";
      }      
    @Override
    public String getStockDescription(){
      return "GeoVision Sat Nav";
      }      
    @Override
    public String toString(){
      return super.toString();
      }      

    
}
