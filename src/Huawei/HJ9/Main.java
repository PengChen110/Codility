package Huawei.HJ9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String s1 = Integer.toString(num);
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--)
        {
            if (!s2.contains(String.valueOf(s1.charAt(i))))
            {
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println(Integer.parseInt(s2));
    }
}
