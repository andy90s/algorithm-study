package chapter1_1_basics;
import algs4.StdIn;
import algs4.StdOut;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        //System.out.println(1 + 2 + "3");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] whitelist = StdIn.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            // 读取值,如果不存在白名单中则将其打印;
            int key = input;
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
        scan.close();
        // 二分查找 遍历
    }

    public  static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static int recursiveRank(int key, int[] a) {
        return recursiveRank(key, a, 0, a.length - 1);
    }

    /*
    * 递归;
    * */
    public static int recursiveRank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return recursiveRank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return recursiveRank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }


}
