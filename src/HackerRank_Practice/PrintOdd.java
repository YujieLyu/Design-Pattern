package HackerRank_Practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintOdd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named HackerRank_Practice.Solution. */
        Scanner scan = new Scanner(System.in);
        String s;

        while (scan.hasNextLine()) {
            s = scan.nextLine();

            if (!isNum(s)) {
                StringBuilder odd = new StringBuilder();
                StringBuilder even = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    String add=String.valueOf(s.charAt(i));
                    if (i % 2 == 0) {
                        even.append(add);
                    } else {
                        odd.append(add);
                    }
                }
                System.out.println(even + " " + odd);

            }
        }

        scan.close();
    }


    private static boolean isNum(String s) {
        String pattern = "\\d+";
        return Pattern.matches(pattern, s);
    }
}

