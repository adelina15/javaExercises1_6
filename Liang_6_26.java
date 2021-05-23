/*(Palindromic prime) A palindromic prime is a prime number and also palindro-
mic. */
package liang.six;

public class Liang_6_26 {
    public static void main(String[] args) {
    printNumbers(100);
    }
    public static void printNumbers(int numberOfPrimes){
    final int PER_LINE  = 10;
    int count = 0;
    int number = 2;
    while (count < numberOfPrimes){
        if (isPrime(number) && isPalindrome(number)){
            count ++;
            if (count % PER_LINE == 0){
                System.out.print(number + "\n");
            }
            else
                System.out.print(number + " ");
        }
        number ++;
    }

    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int number) {return number == reverse(number); }

    public static int reverse(int number){
        String reverse = "";
        String num = number + "";
        for (int i = num.length()-1; i >= 0; i--){
            reverse += num.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
