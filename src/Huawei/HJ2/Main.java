package Huawei.HJ2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine().toLowerCase();
        String s2 = in.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < s1.length(); i++)
        {
            if (Character.toString(s1.charAt(i)).equals(s2))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
