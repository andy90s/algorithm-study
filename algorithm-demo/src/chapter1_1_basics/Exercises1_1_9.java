package chapter1_1_basics;

public class Exercises1_1_9 {
/*
  十进制 转 二进制 字符串;
* */
    public static void main(String[] args) {
        String s = "";
        for (int n = 8; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }
}
