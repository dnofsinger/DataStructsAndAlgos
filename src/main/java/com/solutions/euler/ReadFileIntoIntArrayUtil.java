package com.solutions.euler;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileIntoIntArrayUtil {

    public static int[] read(File file) throws Exception {

        int[] number = new int[1000];

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int arrayIndex = 0;
        while ((st = br.readLine()) != null) {
            for (int i = 0; i < st.length(); i++) {
                int digit = Character.getNumericValue(st.charAt(i));
                number[arrayIndex] = digit;
                arrayIndex++;
            }
        }

        br.close();
        
        return number;

    }

    public static Long multiplyConsecutiveDigits(File file, int digits) throws Exception {

        int[] number = new int[1000];
        Long maxProduct = 0L;
        Long currentProduct = 0L;
        int readIndex = 0;

        number = read(file);
        //Loop through the 1000 digit number
        for (readIndex = 0; readIndex <= (number.length - digits); readIndex++) {
            //Loop through the current number of consecutive digits
            currentProduct = 1L; // Give it one, so we don't multiply by 0 and throw results off
            for (int i = readIndex; i < readIndex + digits; i++) {
                currentProduct *= number[i];
            }
            if (currentProduct > maxProduct)
                maxProduct = currentProduct;
        }
        return maxProduct;
    }

}