package chapter1_1_basics;

import algs4.StdOut;

public class Exercises1_1_15 {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 5, 5};
        int[] timesArr = histogram(arr, 2);
        for (int i = 0; i < timesArr.length; i++) {
            StdOut.printf("数值:%d", timesArr[i]);
        }
    }

    public static int[] histogram(int[] a, int M) {
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            int times = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    times ++;
                }

            }
            arr[i] = times;
        }
        return arr;
    }

}
