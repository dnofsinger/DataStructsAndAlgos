package com.solutions.euler;

import org.junit.Test;
import java.io.File;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ReadFileIntoIntArrayUtilTest{

    final File testDataFile = new File("src/test/resources/TestData.txt");
    
    @Test
    public void testRead(){

        int[] bigNumber = new int[1000];
        try{
            bigNumber = ReadFileIntoIntArrayUtil.read(testDataFile);
        }catch(Exception e){
            System.out.println("Can't find the file.");
            fail();
        }

        assertEquals(6, bigNumber[3]);
    }

    //The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
    @Test
    public void testMultiplyConsecutiveDigits(){

        Long maxProduct = 0L;

        try{
            maxProduct = ReadFileIntoIntArrayUtil.multiplyConsecutiveDigits(testDataFile, 4);
        }catch(Exception e){
            fail();
        }

        assertEquals(Long.valueOf(5832), maxProduct);
    }

    //Project Euler Problem 8 Solved: 23,514,624,000
    @Test
    public void testMultiplyConsecutive13Digits(){

        Long maxProduct = 0L;

        try{
            maxProduct = ReadFileIntoIntArrayUtil.multiplyConsecutiveDigits(testDataFile, 13);
        }catch(Exception e){
            fail();
        }

        assertEquals(Long.valueOf(23514624000L), maxProduct);
    }

}