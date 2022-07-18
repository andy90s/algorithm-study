package chapter1_1_basics;

import algs4.StdOut;

public class Exercises1_1_16 {
    public static void main(String[] args) {
        StdOut.printf(exR1(6));
    }
    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
