package CCBF.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> costList = new ArrayList<>();
        int sumCost = 0;
        int currMoney = 300;
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            String[] items = line.split(",");
            int price = Integer.parseInt(items[0]);
            int preDays = Integer.parseInt(items[1]);
            int realDays = Integer.parseInt(items[2]);

            if (currMoney <= 0)
            {
                break;
            }
            if (price > currMoney)
            {
                continue;
            }

            int cost = 0;
            if (price >= 100)
            {
                if (realDays <= 15)
                {
                    cost = cost + 5 * realDays;
                }
                if (realDays > 15)
                {
                    cost = cost + 15 * 5 + 3 * (realDays - 15);
                }
                if (realDays > preDays)
                {
                    cost = cost + 1 * (realDays - preDays);
                }
            }
            if (price >= 50 && price < 100)
            {
                if (realDays <= 15)
                {
                    cost = cost + 3 * realDays;
                }
                if (realDays > 15)
                {
                    cost = cost + 15 * 3 + 2 * (realDays - 15);
                }
                if (realDays > preDays)
                {
                    cost = cost + 1 * (realDays - preDays);
                }
            }
            if (price < 50)
            {
                cost = cost + 1 * realDays;
                if (realDays > preDays)
                {
                    cost = cost + 1 * (realDays - preDays);
                }
            }
            currMoney -= cost;
            costList.add(cost);
        }
        for (int cost: costList)
        {
            sumCost += cost;
        }
        System.out.println(300 - sumCost);
    }
}
