import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        MyLinkedList m = new MyLinkedList();
        m.add("String");
        m.add("hello");
        m.add("hello");

        try {
            File file=new File("src/myLinkedList_elements");
            Scanner scanner = new Scanner(file);
//            m.insert(2, next);
            while(scanner.hasNext()){
                m.insert(2,scanner.next());
            }
            scanner.close();

        }catch (FileNotFoundException e) {

            System.out.println("no file");
        }


        try{
            Formatter newfile=new Formatter("src/elements");
            newfile.format("%s %s %s","w1","w1","w1");
            newfile.close();

        }catch (Exception e){
            System.out.println("error happens");
        }

        try{
            File file=new File("src/elements");
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                m.add(sc.next());
            }
        }catch (FileNotFoundException e){
            System.out.println("no file");
        }

//        m.delete("String");
//        m.print();
//        m.changeValue(1,"change");
        m.print();
//        System.out.println(m.get(0).toString());
        }

//        getOdd(-90, 12);
//        getOdds(1,10);
//        getNewodd(0,10);
//        getTriples(0,19);
//        Loader loader = new Loader();
//        loader.start();


    public static void getNewodd(int num1, int num2) {
        ArrayList<Integer> odds = new ArrayList<>();
        int init = num1 % 2 == 1 ? num1 : num1 + 1;
        try {
            for (int i = init; i < num2; i += 2) {
                odds.add(i);
            }
        } catch (Exception e) {
            System.out.println("Out of Index");
        }
        System.out.println(odds);
    }

    public static void getOdd(int num1, int num2) {
        int length = (num2 - num1) / 2;
        int[] odd = new int[length];
        odd[0] = num1 % 2 == 1 ? num1 : num1 + 1;
        for (int i = 0; i < length - 1; i++) {
            odd[i + 1] = odd[i] + 2;
            if (odd[i + 1] >= num2) {
                break;
            }
        }

        System.out.println(Arrays.toString(odd));
    }

    private static void getOdds(int num1, int num2) {
        int[] odd = new int[num2 - num1];
        int start = num1 % 2 == 1 ? num1 : num1 + 1;
        int size = 0;
        for (int i = start; i < num2; i += 2) {
            odd[size++] = i;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }

    public static void getTriples(int num1, int num2) {
        ArrayList<Integer> triples = new ArrayList<>();
        int init = num1 % 3 == 1 ? num1 + 2 : num1 % 3 == 2 ? num1 + 1 : num1;
        for (int i = init; i < num2; i += 3) {
            triples.add(i);
        }
        System.out.println(triples);
    }


}
