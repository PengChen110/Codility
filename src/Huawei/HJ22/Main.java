package Huawei.HJ22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
            int i = in.nextInt();
            if (i == 0)
            {
                break;
            }
            else
            {
                System.out.println(i / 2);
            }
        }
    }
}
