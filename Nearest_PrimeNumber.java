package com.Prime;

import java.util.Scanner;

public class Nearest_PrimeNumber {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();  // Input number
        find(n);
    }

    public static void find(int num) {
        // Greater number
        int num1 = num + 1;
        while (true) {
            if (isPrime(num1)) {
                break;
            }
            num1++;
        }

        // Smaller number
        int num2 = num - 1;
        while (num2 > 1) {
            if (isPrime(num2)) {
                break;
            }
            num2--;
        }

     // Explanation and result
        if (num2 == 1) {
            System.out.println("No smaller prime. Nearest prime is greater: " + num1);
        } else if (num1 - num == num - num2) {
            System.out.println("Both smaller and greater primes are equally close.");
            System.out.println("Smaller Prime: " + num2 + ", Greater Prime: " + num1);
        } else if (num1 - num < num - num2) {
            System.out.println("Nearest prime is greater than " + num + ": " + num1);
        } else {
            System.out.println("Nearest prime is smaller than " + num + ": " + num2);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
