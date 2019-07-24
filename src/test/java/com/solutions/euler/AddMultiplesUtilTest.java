package com.solutions.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddMultiplesUtilTest{

    @Test
    public void testAddMultiplesUtil(){

        int[] mults = {3, 5};

        assertEquals(23, AddMultiplesUtil.addMultiples(mults, 10));

    }

    @Test
    public void solveProjectEulerProb1Util(){

        int[] mults = {3, 5};

        //The answer to Problem 1 as verified by other sites is 233,168
        assertEquals(233168, AddMultiplesUtil.addMultiples(mults, 1000));

    }

}