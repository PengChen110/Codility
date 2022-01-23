package Huawei.HJ6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long l = in.nextLong();
        long end = (long) Math.sqrt(l);
        for (long i = 2; i <= end; i++)
        {
            while (l % i == 0)
            {
                System.out.print(i + " ");
                l = l / i;
            }
        }
        System.out.println(l == 1 ? "": l+" ");
    }
}
