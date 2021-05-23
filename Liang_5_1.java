/* (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0 . Display
the average as a floating-point number.*/
package liang.five;

import java.util.Scanner;

public class Liang_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0:");
        int data = input.nextInt();
        int positives = 0;
        int negatives = 0;
        double total = 0;
        int quantity = 0;
        double average = 0;
        while (data!=0){
            quantity ++;
            total += data;
            if (data > 0) positives ++;
            if (data < 0) negatives ++;
            data = input.nextInt();
        }
        if (quantity == 0) System.out.println("No numbers are entered except zero");
        else {
            average = total / quantity;
        }
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
