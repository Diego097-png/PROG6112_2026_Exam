package com.mycompany.productapp;

public class Product implements IProduct {
    
    private int[][] salesData;
    private String[] productNames;
    
    public Product() {
        //Sample data
        this.salesData = new int [][] {
                {25, 30, 18},
                {15, 22, 28},
                {19, 13, 24}
        };
        this.productNames = new String[] {
            "Cozy Nights Monarch",
             "Restonic Barbados",
            "Seally Phuket"
        };
    } 
    
    //Check total sales
    @Override
    public int GetTotalProductsSold(int[][] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
            total += sales[i][j];
            }
        }
        return total;                
    }
    
    //Calculate average sales
    @Override
    public double GetAverageProductSold(int[][] sales) {
        int total = GetTotalProductsSold(sales);
        int totalElements = 0;
        for (int i = 0; i < sales.length; i++) {
            totalElements += sales[i].length;
        }
        return totalElements = 0 ? 0.0 : (double) total / totalElements;
    }
    
    //Get most popular product
    public String GetMostPopulerProduct(String[] Product, int[][] sales) {
        int maxTotal = -1;
        String topProduct = "";
        
        for ( int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales.length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                topProduct = Product[i] + " ( " + maxTotal + ") ";
            }
        }
        return topProduct;  
    }
    
}