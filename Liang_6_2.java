/*(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. */
package liang.six;

import java.util.Scanner;

public class Liang_6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        System.out.println("sum of the digits in " + num + " is " +sumDigits(num));
    }
    public static int sumDigits (long n){
        int sum = 0;
        while (n>0){
            int digit = (int) (n % 10);
            n /= 10;
            sum += digit;
        }
        return sum;
    }
}
