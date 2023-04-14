package com.gqt.arraysproj.package1;


import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        System.out.println("The first " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 + " ");
        }
    }
}
