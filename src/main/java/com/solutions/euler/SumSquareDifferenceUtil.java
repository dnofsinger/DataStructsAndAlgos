package com.solutions.euler;

public class SumSquareDifferenceUtil{

    public static int difference(int range){
        int sumOfTheSquares = 0;
        int squareOfTheSum = 0;

        for(int i = 1; i <= range; i++){
            sumOfTheSquares += Math.pow(i, 2);
            squareOfTheSum += i;
        }

        squareOfTheSum = squareOfTheSum * squareOfTheSum;

        return squareOfTheSum - sumOfTheSquares;
    }

}