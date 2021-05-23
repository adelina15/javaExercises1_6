/* (Financial application: payroll) Write a program that reads the following information
 and prints a payroll statement*/
package liang.four;
import java.util.Scanner;

public class Liang_4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Employee’s name (e.g., Smith):");
        String name = input.nextLine();
        System.out.println("Number of hours worked in a week (e.g., 10):");
        double hours = input.nextDouble();
        System.out.println("Hourly pay rate (e.g., 9.75):");
        double payRate = input.nextDouble();
        System.out.println("Federal tax withholding rate (e.g., 20%):");
        double federalTax = input.nextDouble();
        System.out.println("State tax withholding rate (e.g., 9%):");
        double stateTax = input.nextDouble();

        double grossPay = payRate * hours;
        double federalWithhold = grossPay * (federalTax / 100);
        double stateWithhold = grossPay * (stateTax /100);
        double deduction = federalWithhold + stateWithhold;
        double netPay = grossPay - deduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f \n", federalTax, federalWithhold );
        System.out.printf("  State Withholding (%.1f%%): $%.2f \n", stateTax, stateWithhold);
        System.out.printf("  Total deduction :$%.2f \n", deduction);
        System.out.printf("Net Pay: $%.2f \n", netPay);
    }
}
