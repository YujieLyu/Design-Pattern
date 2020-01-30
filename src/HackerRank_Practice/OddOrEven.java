package HackerRank_Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class OddOrEven {

    private static void checkNum(int num){
        if(num%2==1){
            System.out.println("Weird");
        }else{
            if((2<=num&&5>=num)||num>20){
                System.out.println("Not Weird");
            }else if(6<=num&&20>=num){
                System.out.println("Weird");
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        checkNum(N);
        scanner.close();
    }
}
