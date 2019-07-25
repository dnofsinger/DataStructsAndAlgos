package com.solutions.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheNthPrimeUtilTest {

    @Test
    public void testNthPrime(){

        int result = FindTheNthPrimeUtil.nthPrime(6);

        assertEquals(result, 13);

        result = FindTheNthPrimeUtil.nthPrime(10001);

        assertEquals(result, 104743);

    }

}