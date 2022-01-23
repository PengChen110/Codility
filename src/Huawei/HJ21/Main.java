package Huawei.HJ21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isDigit(c))
            {
                sb.append(c);
            }
            if (Character.isLowerCase(c))
            {
                if ("abc".contains(String.valueOf(c)))
                {
                    sb.append("2");
                }
                else if ("def".contains(String.valueOf(c)))
                {
                    sb.append("3");
                }
                else if ("ghi".contains(String.valueOf(c)))
                {
                    sb.append("4");
                }
                else if ("jkl".contains(String.valueOf(c)))
                {
                    sb.append("5");
                }
                else if ("mno".contains(String.valueOf(c)))
                {
                    sb.append("6");
                }
                else if ("pqrs".contains(String.valueOf(c)))
                {
                    sb.append("7");
                }
                else if ("tuv".contains(String.valueOf(c)))
                {
                    sb.append("8");
                }
                else
                {
                    sb.append("9");
                }
            }
            if (Character.isUpperCase(c))
            {
                if (c == 'Z')
                {
                    sb.append("a");
                }
                else
                {
                    sb.append((char) (Character.toLowerCase(c) + 1));
                }
            }
        }
        System.out.println(sb);
    }
}
