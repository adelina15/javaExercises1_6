/*(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge. */


package liang.three;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Liang_3_19 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    if(a + b > c && b + c > a && c + a > b) {
        int perimeter = a + b+ c;
        System.out.print("Perimeter is " + perimeter);
    } else {
        System.out.println("Invalid input");
    }
    }
}
