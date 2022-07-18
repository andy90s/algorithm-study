package chapter1_1_basics;

import algs4.StdOut;

public class Exercises1_1_14 {
    public static void main(String[] args) {
        StdOut.println(lg(9));
    }
    /*
    *  返回一个不大于log2^N的最大整数;
    * */
    public static int lg(int N) {
        //
        int i = 0;
        while (n2(i) <= N) {
            i ++;
        }
        return i - 1;
    }

    public static int n2(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *=2;
        }
        return result;
    }
}
