package Huawei.HJ34;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine())
        {
            String s = in.nextLine();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            System.out.println(c);
        }
    }
}
