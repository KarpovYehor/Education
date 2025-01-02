package com.telran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppExampleTest {

    @Test
    public void testGetSum(){
        int a = 2;
        int b = 3;
        int sum = AppExample.getSum(a, b);
        assertEquals(5, sum);
    }

    @Test
    public void testGetFullPrice(){
        int priceTrip = 5;
        int number = 2;
        int fullPrice = AppExample.getSumPrice(priceTrip, number);
        assertEquals(10, fullPrice);
    }
}