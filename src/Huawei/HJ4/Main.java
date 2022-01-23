package Huawei.HJ4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "0000000";
        while (in.hasNextLine())
        {
            String s2 = in.nextLine() + s1;
            while (s2.length() >= 8)
            {
                System.out.println(s2.substring(0, 8));
                s2 = s2.substring(8);
            }
        }
    }
}
