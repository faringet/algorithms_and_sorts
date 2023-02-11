package sorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BubbleSortIO {

    public static void main(String[] args) {
        long heapSize = Runtime.getRuntime().maxMemory();
        System.out.println("Heap Size = " + heapSize);
        String[] array = null;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("input.txt"));
            int length = 0;
            while (sc.hasNextLine()) {
                length++;
                sc.nextLine();
            }
            sc.close();
            sc = new Scanner(new File("input.txt"));
            array = new String[length];
            for (int i = 0; i < length; i++) {
                array[i] = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    String temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        try (PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            for (String s : array) {
                pw.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}