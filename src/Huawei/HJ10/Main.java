package Huawei.HJ10;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
        {
            hashSet.add(s.charAt(i));
        }
        System.out.println(hashSet.size());
    }
}
