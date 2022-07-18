package chapter1_1_basics;

import algs4.StdOut;

public class Exercises1_1_19 {

    static final int M = 100;

    static long[] arr = new long[M];

    public static long F(int N) {
        if (N == 0) {
            arr[N] = 0;
        } else if (N == 1) {
            arr[N] = 1;
        } else {
            arr[N] = arr[N - 1] + arr[N - 2];
        }
        return arr[N];
    }
    public static void main(String[] args) {

        for (int i = 0; i < M; i++) {
            StdOut.println(i + " " + F(i));
        }

    }

}
