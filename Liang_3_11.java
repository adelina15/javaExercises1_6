/*Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012 , the program should display
that February 2012 had 29 days */
package liang.three;
import java.util.Scanner;

public class Liang_3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        switch (month){
            case 1: System.out.print("January " + year + " had 31 days"); break;
            case 2: System.out.print("February " + year + " had");
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.print(" 29 days");
            }
            else {
                System.out.print(" 28 days");
            } break;
            case 3: System.out.print("March " + year + " had 31 days"); break;
            case 4: System.out.print("April " + year + " had 30 days"); break;
            case 5: System.out.print("May " + year + " had 31 days"); break;
            case 6: System.out.print("June " + year + " had 30 days"); break;
            case 7: System.out.print("July " + year + " had 31 days"); break;
            case 8: System.out.print("August " + year + " had 31 days"); break;
            case 9: System.out.print("September " + year + " had 30 days"); break;
            case 10: System.out.print("October " + year + " had 31 days"); break;
            case 11: System.out.print("November " + year + " had 30 days"); break;
            case 12: System.out.print("December " + year + " had 31 days"); break;
        }
    }
}
