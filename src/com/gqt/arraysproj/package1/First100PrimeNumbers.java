package com.gqt.arraysproj.package1;

public class First100PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2; // starting from 2, which is the smallest prime number

        System.out.println("First 100 Prime Numbers:");

        while (count < 100) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    	

}
