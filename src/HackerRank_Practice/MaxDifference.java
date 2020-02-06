package HackerRank_Practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] eles) {
        elements = eles;
    }

    public void computeDifference() {
        int max = 0;
        int len = elements.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 1; j < len; j++) {
                int temp = Math.abs(elements[i] - elements[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        maximumDifference=max;
    }
} // End of Difference class

public class MaxDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}