package com.mycompany.productapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Used to verify sales, average, and most popular calculations

public class ProductTest {
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        Product product = new Product();
        int expected = 153;
        int actual = product.GetTotalProductsSold();
        assertEquals(expected, actual);
    }
    
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product();
        double expected = 17.0;
        double actual = product.GetAverageProductSold();
        assertEquals(expected, actual);
    }
}
