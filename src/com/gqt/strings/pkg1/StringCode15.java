package com.gqt.strings.pkg1;
import java.util.Scanner;

public class StringCode15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        
        String alphaStr = "";
        String numStr = "";
        String specialStr = "";
        
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (Character.isLetter(ch)) {
                alphaStr += ch;
            } else if (Character.isDigit(ch)) {
                numStr += ch;
            } else {
                specialStr += ch;
            }
        }
        
        System.out.println("Alphabets: " + alphaStr);
        System.out.println("Numbers: " + numStr);
        System.out.println("Special Characters: " + specialStr);
    }
}