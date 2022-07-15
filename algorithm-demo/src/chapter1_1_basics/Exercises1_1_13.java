package chapter1_1_basics;

import java.util.Arrays;

public class Exercises1_1_13{
    /*
    * 交换二维数组行列
    * */
    public static void main(String[] args) {

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = new int[3][a.length];
        System.out.println("原始数组");
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]) + "\t");
        }
        int m = a.length;
        int n = 3;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("转换后数组");
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]) + "\t");
        }
    }
}
