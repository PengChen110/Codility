package Huawei.HJ14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++)
        {
            arrayList.add(in.next());
        }

        arrayList.sort(Comparator.naturalOrder());
        for (String word: arrayList)
        {
            System.out.println(word);
        }
    }
}
