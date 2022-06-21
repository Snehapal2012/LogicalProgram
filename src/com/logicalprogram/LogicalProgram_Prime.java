package com.logicalprogram;

import java.util.Scanner;

public class LogicalProgram_Prime {
    public static void Prime() {
        int i, n, count = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = r.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Input number is not a prime number!");
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    count = count + 1;
                    break;
                }
            }

            if (count > 0) {
                System.out.println("Input number is a not prime number !");
            } else System.out.println("Input number is a prime number!");
        }
    }
    public static void main(String[] args) {
        Prime();
    }
}
