package com.solutions.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddMultiplesUtilTest{

    @Test
    public void testAddMultiplesUtil(){

        int[] mults = {3, 5};

        assertEquals(23, AddMultiplesUtil.addMultiples(mults, 10));

    }

}