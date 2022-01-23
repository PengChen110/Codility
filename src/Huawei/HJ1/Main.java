package Huawei.HJ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] arr = s.split(" ");
        System.out.println(arr[arr.length - 1].length());
    }
}
