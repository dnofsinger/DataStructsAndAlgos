package com.solutions.euler;

public class PalindromeUtil{

    public static String findLargestPalindrome_2Digits(){

        String result = "";

        int highestPalindrome = 0;

        for(int i = 10; i <= 99; i++){
            //Start J where I is. This should cut down on repetitive calcs.
            for(int j = i; j <= 99; j++){
                if(isPalindrome(i * j)){
                    if((i * j) > highestPalindrome)
                        highestPalindrome = i * j;
                }
            }
        }

        result = String.valueOf(highestPalindrome);

        return result;
    }

    public static String findLargestPalindrome_3Digits(){

        String result = "";

        int highestPalindrome = 0;

        for(int i = 100; i <= 999; i++){
            //Start J where I is. This should cut down on repetitive calcs.
            for(int j = i; j <= 999; j++){
                if(isPalindrome(i * j)){
                    if((i * j) > highestPalindrome)
                        highestPalindrome = i * j;
                }
            }
        }

        result = String.valueOf(highestPalindrome);

        return result;
    }

    public static boolean isPalindrome(int value){

        String valueString = String.valueOf(value);
        String valueString_Rev;

        StringBuilder builder = new StringBuilder();

        builder.append(valueString);

        valueString_Rev = builder.reverse().toString();

        return(valueString.equals(valueString_Rev));
    }
}