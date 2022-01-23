package CCBF.Q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
//        while (in.hasNextLine())
//        {
//            String line = in.nextLine();
//            if (hashMap.containsKey(line))
//            {
//                hashMap.put(line, hashMap.get(line) + 1);
//            }
//            else
//            {
//                hashMap.put(line, 1);
//            }
//        }

        hashMap.put("2019-01-01 08:59:00.123", 2);
        hashMap.put("2018-12-28 10:08:00.999", 1);
        hashMap.put("2019-01-01 08:59:00.120", 1);

        ArrayList<String> keyList = new ArrayList<>();
        for (String key: hashMap.keySet())
        {
            keyList.add(key);
        }
        keyList.sort(Comparator.naturalOrder());
        for (int i = 1; i < keyList.size(); i++)
        {
            String k1 = keyList.get(i - 1);
            String k2 = keyList.get(i);

            String[] arr1 = k1.split("\\.");
            String pre1 = arr1[0];
            String suf1 = arr1[1];

            String[] arr2 = k2.split("\\.");
            String pre2 = arr2[0];
            String suf2 = arr2[1];

            if (pre1.equals(pre2))
            {
                if (! suf1.equals(suf2))
                {
                    hashMap.remove(k2);
                }
            }
        }

        int sum = 0;
        for (int num: hashMap.values())
        {
            sum += num;
        }
        System.out.println(sum);
    }
}
