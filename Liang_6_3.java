package liang.six;

import java.util.Scanner;

public class Liang_6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (isPalindrome(num)) System.out.println(num + " is palindrome");
        else System.out.println(num + " is not palindrome");
    }
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number){
       String reverse = "";
       String n = number + "";
       for (int i = n.length()-1; i >= 0; i--){
           reverse += n.charAt(i);
       }
        return Integer.parseInt(reverse);
    }
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
}
