package com.codebind;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        int n; //number to test until
        int d;  // digit to see if it is in the number
        int i;
        int compare = 0;
        String nString;
        ArrayList numbers = new ArrayList();

        Scanner maxNumber = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = maxNumber.nextInt();

        Scanner findDigit = new Scanner(System.in);
        System.out.println("Enter a digit:");
        d = findDigit.nextInt();
        findDigit.close();
        maxNumber.close();
        char testDigit = (char) (d + '0');


        while (compare <= n) {
            nString = String.valueOf(compare); //converts compare to a string
            int nStringLength = nString.length(); // gets string length
            i = 0;
            while (i < nStringLength) {
                char digit = nString.charAt(i); //comparing the digit to the character in spot i in nString
                if (digit == testDigit) {
                    i = nStringLength;
                    //System.out.println(compare); //if the testdigit is equal to digit then prints out the number
                    numbers.add(compare);
                } else
                    i++; //increments i
            }
            compare++; //increments to next number to compare
            if (compare > n)
                System.out.println(numbers);

        }
    }
}


