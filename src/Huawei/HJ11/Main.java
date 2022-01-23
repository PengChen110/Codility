package Huawei.HJ11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = String.valueOf(in.nextInt());
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}
