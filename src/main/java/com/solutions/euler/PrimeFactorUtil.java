package com.solutions.euler;

import java.util.List;
import java.util.ArrayList;



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

}