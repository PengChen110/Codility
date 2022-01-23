package Huawei.HJ23;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (in.hasNextLine())
        {
            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++)
            {
                hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
            }

        }
    }
}
