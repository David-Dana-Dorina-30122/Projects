package isp.lab2.Exercise4StringSearch;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4StringSearch {

    public static String[] searchSubstrings(String input, String substring) {
        String[] b = input.split(",");
        int c = 0, l = 0;
        for (int i = 0;i < b.length; i++) {
        if(b[i].contains(substring) )
            c++;
        }
        String[] a = new String[c];
        for (int i = 0;i < b.length; i++) {
            if (b[i].contains(substring))
                a[l++] = b[i];
        }
        return a;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Sirul: ");
        String input = readFromConsoleInt();
        System.out.println("Subsirul");
        String substring = readFromConsoleInt();
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
