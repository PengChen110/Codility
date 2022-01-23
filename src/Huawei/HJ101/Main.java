package Huawei.HJ101;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++)
        {
            arr[i] = in.nextInt();
        }
        int flag = in.nextInt();
        Arrays.sort(arr);
        if (flag == 0)
        {
            for (int i: arr)
            {
                System.out.print(i + " ");
            }
        }
        else if (flag == 1)
        {
            for (int i = arr.length - 1; i >= 0; i--)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
