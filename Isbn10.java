package liang.three;
import java.util.Scanner;
public class Isbn10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int d9 = number1 % 10;
        int number = number1 / 10;
        int d8 = number % 10;
        number /= 10;
        int d7 = number % 10;
        number /= 10;
        int d6 = number % 10;
        number /= 10;
        int d5 = number % 10;
        number /= 10;
        int d4 = number % 10;
        number /= 10;
        int d3 = number % 10;
        number /= 10;
        int d2 = number % 10;
        number /= 10;
        int d1 = number % 10;
        number /= 10;
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.print(number1);
        if (d10 == 10){
            System.out.print("X");
        } else {
            System.out.print(d10);
        }

    }
}