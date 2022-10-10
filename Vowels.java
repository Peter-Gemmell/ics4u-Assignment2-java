/*
* This is a program that calculates mean, median and mode
* after reading in a text file into an array.
*
* @author  Peter Gemmell
* @version 1.0
* @since   2022-09-27
*/

import java.util.Scanner;

/**
* This is the vowels program.
*/
final class Vowels {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Vowels() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The vowelCount() function.
    *
    * @param sentence the sentence
    * @return count of the vowels in sentence
    */

    public static int vowelCount(String sentence) {
        final String stringLow = sentence.toLowerCase();
        int count = 0;
        final int length = stringLow.length();

        for (int loop = 0; loop < length; loop++) {
            final char ch = stringLow.charAt(loop);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                         || ch == 'y') {
                count++;
            }
        }
        return count;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        try {
            System.out.println("Enter a sentence :");
            final Scanner sc = new Scanner(System.in);
            final String sentence = sc.nextLine();
            final int numberVowels = vowelCount(sentence);
            System.out.println("Number of vowels in the given sentence is "
                          + numberVowels);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("ERROR: " + error);
        } finally {
            System.out.println("Done.");
        }
    }
}
