package Huawei.HJ3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (in.hasNextInt())
        {
            int num = in.nextInt();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < num; i++)
            {
                treeSet.add(in.nextInt());
            }
            arrayList.addAll(treeSet);
        }
        for (int i: arrayList)
        {
            System.out.println(i);
        }
    }
}
