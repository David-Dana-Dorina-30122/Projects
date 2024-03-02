package isp.lab2.Exercise6WordGuess;
import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static int countOccurence(char c, char[] word) {
//        int tries = 0;
//        int i = 0;
//        while (i < word.length()) {
//            int ok = 1;
//            tries++;
//            for (int l = 0; l < word.length(); l++) {
//                if (word.charAt(l) == c) {
//                    ok = 0;
//                    i++;
//                    System.out.println("The letter is in the word at position: " + l);
//                }
//            }
//            if(ok == 1){ System.out.println("The letter is not in the word");}
//        }
        return -1; //tries;
   }

    public static void main(String[] args) {

        String[] s = {"fred", "jane", "richardnixon", "missamerica"};
        int index = random.nextInt(s.length);
        String word = s[index];
        char[] vectorCaractere = new char[word.length()];
//        char c = 0;
//        int i = 0;
//        while (i < 20 ){
//            System.out.println("Guess a letter: ");
//            c = scanner.next().charAt(0);
//            i++;
//        }
//        System.out.println("The word is: ");
//        for (int j = 0; j < word.length(); j++) {
//            System.out.print(word.charAt(j));
//        }
//        System.out.println("\nYou guessed it in: " + countOccurence(c,vectorCaractere) + " tries");


        int tries = 0;
        int i = 0;
        while (i < word.length()) {
            int ok = 1;
            System.out.println("Guess a letter: ");
            char c = scanner.next().charAt(0);
            tries++;
            for (int l = 0; l < word.length(); l++) {
                if (word.charAt(l) == c) {
                    ok = 0;
                    i++;
                    System.out.println("The letter is in the word at position: " + l);
                }
            }
                 if(ok == 1){ System.out.println("The letter is not in the word");}
        }
        System.out.println("The word is: ");
        for (int j = 0; j < word.length(); j++) {
            System.out.print(word.charAt(j));
        }
        System.out.println("\nYou guessed it in: " + tries + " tries");

    }

}
