package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */
    public static long getPrimeProduct(int n, int m) {
        int prod = 1;
        for(int i = n; i <= m; i++) {
           int ok = 1, j=2;
            while(ok == 1 && j <= m) {
                        if (((i % j) == 0) && (i != j)) {
                            ok = 0;
                        } else ok = 1;
                    j++;
            }
            if(ok == 1)
                prod *= i;
        }
        return prod;
    }

    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
