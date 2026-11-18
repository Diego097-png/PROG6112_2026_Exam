package com.mycompany.productapp;

public class PrintProduct {
    private Product product;
    
    public PrintProduct() {
        this.product = new Product();
    }
public void printTotalSales(){
        System.out.println(" TOTAL PRODUCT SALES: ");
}
    
public void printAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: ");
}

public void printPopularProduct(){
        System.out.println("MOST POPULAR PRODUCT: ");
}


    
}
