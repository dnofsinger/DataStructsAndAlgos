package com.solutions.euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumSquareDifferenceUtilTest{

    @Test
    public void testDifference(){
        int result = SumSquareDifferenceUtil.difference(10);

        assertEquals(2640, result);

        result = SumSquareDifferenceUtil.difference(100);

        assertEquals(25164150, result);
    }

}