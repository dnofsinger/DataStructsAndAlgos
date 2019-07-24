package com.solutions.euler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PalindromeUtilTest{


    /*     
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers. 
    */
    @Test
    public void test_largestPalindrome_2Digits(){

        assertEquals("9009", PalindromeUtil.findLargestPalindrome_2Digits());

    }

    // Project Euler Problem 4 Solved
    @Test
    public void test_largestPalindrome_3Digits(){

        assertEquals("906609", PalindromeUtil.findLargestPalindrome_3Digits());

    }
    
    
    @Test
    public void test_ifPalindrome(){

        assertEquals(true, PalindromeUtil.isPalindrome(505));

        assertEquals(false, PalindromeUtil.isPalindrome(507));

    }

}