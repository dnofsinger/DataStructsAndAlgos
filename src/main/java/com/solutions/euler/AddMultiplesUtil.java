package com.solutions.euler;

/* 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. 
*/

public class AddMultiplesUtil {

    //function will take O(n)^2 time
    static int addMultiples(int[] multiples, int range){

        int sum = 0;
        // Go through every number in the requested range O(n)
        for( int i = 0; i < range; i++){

            // Go through every multiple to see if we can divide by the number O(n)
            for (int mult : multiples){

                if(i % mult == 0)
                {
                    sum += i;
                    break;
                }

            }

        }

        return sum;
        
    }
}