package com.ob;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static String reverse(String txt) {
        String rv = new String();

        for (int i = txt.length() - 1; i >= 0; i--) {
            rv += txt.charAt(i);
        }

        return rv;
    }

    public static void DividePorCero() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers: ");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.printf("result: %d", n1 / n2);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void copyFiles(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(data);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
        System.out.println();

        System.out.println("1:");
        String[] arr = {"crea", "un", "array", "unidimensional", "de", "Strings"};
        for (String s : arr) {
            System.out.printf("%s - ", s);
        }
        System.out.println("\n\n");

        System.out.println("2:");
        int[][] bd = {{0, 3, 4, 5}, {8, 3, 4, 1}, {1, 2, 3, 4}};
        for (int i = 0; i < bd.length; i++) {
            for (int j = 0; j < bd[0].length; j++) {
                System.out.printf("%d-%d -> %d%n", i, j, bd[i][j]);
            }
        }
        System.out.println();

        System.out.println("3:");
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }
        vector.remove(1);
        vector.remove(2);
        System.out.println(vector + "\n");

        System.out.println("4:");
        System.out.println("El vector con la capacidad por defector se trendría que copiar" +
                "cada vez que se alcanze su capacidad máxima, esto llevaría a un problema de" +
                "rendimiento si la cantidad datos a guardar son muy grandes \n");

        System.out.println("5:");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("El");
        arrayList.add("vector");
        arrayList.add("con");
        arrayList.add("la");

        LinkedList<String> linkedList = new LinkedList<String>();
        for (String s : arrayList) {
            linkedList.add(s);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.printf("From AL: %s%n", arrayList.get(i));
            System.out.printf("From LL: %s%n", linkedList.get(i));
        }
        System.out.println();

        System.out.println("6:");
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            al2.add(i);
        }
        for (int i = 0; i < al2.size(); i++) {
            if (al2.get(i) % 2 == 0) {
                al2.remove(i);
                continue;
            }
        }
        System.out.println(al2 + "\n");

        System.out.println("7:");
        DividePorCero();

        System.out.println("8:");
        System.out.println("copying file ...");
        copyFiles("/etc/passwd", "passwdCopy.txt");
    }
}
