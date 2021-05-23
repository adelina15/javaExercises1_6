/*(Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year. */
package liang.five;

public class Liang_5_7 {
    public static void main(String[] args) {
        int tuition = 10000;
        int total = 0;
        int tuition10 = 0;
        for (int year = 1; year <= 14; year ++){
            tuition += (tuition * 0.05);
            if (year == 10){
                tuition10 = tuition;
            }
            if (year > 10){
                total += tuition;
            }
        }

        System.out.println("In 10 years tuition will be $" + tuition10);
        System.out.println("Total cost of four years' worth of tuition after 10 years will be $" + total);
    }
}
