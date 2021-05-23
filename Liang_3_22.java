/* (Geometry: point in a circle?) Write a program that prompts the user to enter a
point ( x , y ) and checks whether the point is within the circle centered at ( 0 , 0 )
with radius 10*/


package liang.three;

import java.util.Scanner;

public class Liang_3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates:");
        int x = input.nextInt();
        int y = input.nextInt();
        int formula = (int) (Math.pow(x, 2) + Math.pow(y,2));
        int distance = (int) Math.pow(formula, 0.5);
        if (distance <= 10){
            System.out.println("Point (" + x + ".0, " + y + ".0) is in the circle");
        } else{
            System.out.println("Point (" + x + ".0, " + y + ".0) is not in the circle");
        }

    }
}
