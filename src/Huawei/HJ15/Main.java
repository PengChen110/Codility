package Huawei.HJ15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = Integer.toBinaryString(in.nextInt());
        System.out.println(s.replaceAll("0","").length());
    }
}
