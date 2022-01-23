package Huawei.HJ5;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String s  = in.next().substring(2);
            String result = new BigInteger(s, 16).toString(10);
            System.out.println(result);
        }
    }
}
