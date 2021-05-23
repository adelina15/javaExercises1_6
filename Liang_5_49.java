package liang.five;

import java.util.Locale;
import java.util.Scanner;

public class Liang_5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i<sentence.length(); i++){
            if (Character.isLetter(sentence.charAt(i))) {
                if (Character.toUpperCase(sentence.charAt(i)) == 'A' ||
                        Character.toUpperCase(sentence.charAt(i)) == 'O' ||
                        Character.toUpperCase(sentence.charAt(i)) == 'U' ||
                        Character.toUpperCase(sentence.charAt(i)) == 'E' ||
                        Character.toUpperCase(sentence.charAt(i)) == 'I') {
                    vowels++;
                } else {
                    consonants++;
                }
            }

        }
        System.out.println(vowels + " " + consonants);
    }
}
