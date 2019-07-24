package com.solutions.euler;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PrimeFactorUtil{
    
    public static List<Integer> findPrimeFactors(int number){

        int n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++){
            while(n % i == 0){
                factors.add(i);
                n /= i;
            }
        }

        return factors;

    }

    public static List<Integer> findPrimeFactors(Long number){

        Long n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++){
            while(n % i == 0){
                factors.add(i);
                n /= i;
            }
        }

        return factors;

    }

    public static int findLargestPrimeNumber(int number){

        List<Integer> primeNumbers = new ArrayList<>();
        
        primeNumbers = findPrimeFactors(number);

        int largestPrimeNumber = primeNumbers.get(primeNumbers.size() - 1);

        return largestPrimeNumber;

    }

    public static Long findLargestPrimeNumber(Long number){

        List<Integer> primeNumbers = new ArrayList<>();
        
        primeNumbers = findPrimeFactors(number);

        Long largestPrimeNumber = primeNumbers.get(primeNumbers.size() - 1).longValue();

        return largestPrimeNumber;

    }

    public static int findSmallestProductWithinRange(int range){
        
        Map<Integer, Integer> minimumPrimesNeeded = new HashMap<>();

        //Go through every number in range
        for(int i = 2; i <= range; i++){
            int number = i;
            //Get the factors of i
            for (int j = 2; j <= number; j++){
                int primeNumberNeeded = 0;
                while(number % j == 0){
                    //Divide the current number by the factor
                    number /= j;
                    //Add the number of this prime needed
                    primeNumberNeeded++;
                }
                //Retrieved factors, check to see if it's the bare minimum needed
                if(!minimumPrimesNeeded.containsKey(j)){
                    minimumPrimesNeeded.put(j, primeNumberNeeded);
                }else if(minimumPrimesNeeded.get(j) < primeNumberNeeded){
                    //If we do have the factor in the map and it has less than what we counted this iteration
                    minimumPrimesNeeded.put(j, primeNumberNeeded);
                }
            }
        }

        //Once we grabbed the minimum factors needed for every number in range
        //Let's multiple the numbers to get the result
        int result = 1;
        for(Map.Entry<Integer, Integer> entry : minimumPrimesNeeded.entrySet()){
            if(entry.getValue() != 0)
                result *= Math.pow(entry.getKey(),entry.getValue());
        }

        return result;

    }
}