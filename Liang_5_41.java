/* (Occurrence of max numbers) Write a program that reads integers, finds the larg-
est of them, and counts its occurrences. Assume that the input ends with number
0 .*/
package liang.five;

import java.util.Scanner;

public class Liang_5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int max = 0;
        int count = 0;
        while (num != 0){
            num = input.nextInt();
            if (num > max){
                max = num;
                count = 0;
            }
            if (num == max){
                count ++;
            }
        }
        System.out.println(" Max number = " + max + " and it occurs " + count + " times");
    }
}
