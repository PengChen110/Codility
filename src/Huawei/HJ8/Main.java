package Huawei.HJ8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<Integer, Integer> hashMap = new TreeMap<>();
        for (int i = 0; i < n; i++)
        {
            int key = in.nextInt();
            int val = in.nextInt();
            if (hashMap.containsKey(key))
            {
                int curVal = hashMap.get(key);
                hashMap.put(key, curVal + val);
            }
            else
            {
                hashMap.put(key, val);
            }
        }

        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
