/*(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology */

package liang.four;
import java.util.Scanner;

public class Liang_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        char major = input1.charAt(0);
        char status = input1.charAt(1);
        if(major == 'M') System.out.print("Mathematics");
        else if (major == 'C') System.out.print("Computer Science");
        else if (major == 'I') System.out.print("Informational Technology");
        if (status == '1')
            System.out.print(" Freshman");
        else if (status == '2')
            System.out.print(" Sophomore");
        else if (status == '3')
            System.out.print(" Junior");
        else if (status == '4')
            System.out.print(" Senior");
    }
}
