package com.solutions.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class PrimeFactorUtilTest{

    /* 
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ? 
    */
    @Test
    public void findPrimeFactorsTest(){
        
        int result = PrimeFactorUtil.findLargestPrimeNumber(13195);

        assertEquals(29, result);
    }

    @Test
    public void findPrimeFactorsTest_solveEulerProblem3(){
        
        long result = PrimeFactorUtil.findLargestPrimeNumber(600851475143L);

        assertEquals(6857, result);
    }


    /*
    Euler Problem 5:
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

    @Test
    public void test_findSmallestProductWithinRange(){

        int result = PrimeFactorUtil.findSmallestProductWithinRange(10);

        assertEquals(2520, result);

        result = PrimeFactorUtil.findSmallestProductWithinRange(20);

        assertEquals(232792560, result);

    }

}