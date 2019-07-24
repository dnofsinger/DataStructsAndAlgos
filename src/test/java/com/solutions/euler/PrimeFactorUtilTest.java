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

}