/* (Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid. */

package liang.four;
import java.util.Scanner;

public class Liang_4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ssn = input.nextLine();
        if (!Character.isDigit(ssn.charAt(3)) && !Character.isDigit(ssn.charAt(6)) )
            System.out.println(ssn + " is a valid social security number");
        else System.out.println(ssn + " is an invalid social security number");
    }
}
