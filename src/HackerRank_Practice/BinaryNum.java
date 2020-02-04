package HackerRank_Practice;

import com.sun.tools.javah.Util;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.System.exit;

public class BinaryNum {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binNum = Integer.toBinaryString(n);
        int maxCount = 0;
        int checkDigit;
        int count = 0;
        int len = binNum.length();
        for (int i = 0; i < len; i++) {
            checkDigit = Character.getNumericValue(binNum.charAt(i));
            if (checkDigit == 1) {
                count++;
                if (i == len - 1) {
                    maxCount = maxCount < count ? count : maxCount;
                }
            } else {
                maxCount = maxCount < count ? count : maxCount;
                count = 0;
            }
        }
        System.out.println(maxCount);
        scanner.close();
    }
}
