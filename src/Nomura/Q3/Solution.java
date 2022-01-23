package Nomura.Q3;

public class Solution {
    public int solution(String S) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < S.length(); i++)
        {
            if (S.charAt(i) == 'a')
            {
                count++;
            }
        }
        if (count % 3 != 0)
        {
            result = 0;
        }
        else if (count == 0)
        {
            result = ((S.length() - 1) * (S.length() - 2)) / 2;
        }
        else if (count == 3)
        {
            int a1 = 0, a2 = 0, a3 = 0;
            int cA = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'a') {
                    cA++;
                    if (cA == 1)
                    {
                        a1 = i;
                    }
                    if (cA == 2)
                    {
                        a2 = i;
                    }
                    if (cA == 3)
                    {
                        a3 = i;
                        break;
                    }
                }
            }
            result = (a2 - a1) * (a3 - a2);
        }
        else
        {
            int pos1 = 0, pos2 = 0, pos3 = 0, pos4 = 0;
            int c = 0;
            for (int i = 0; i < S.length(); i++)
            {
                if (S.charAt(i) == 'a')
                {
                    c++;
                    if (c == count / 3)
                    {
                        pos1 = i;
                    }
                    if (c == (count / 3) + 1)
                    {
                        pos2 = i;
                    }
                    if (c == (count / 3) * 2)
                    {
                        pos3 = i;
                    }
                    if (c == (count / 3) * 2 + 1)
                    {
                        pos4 = i;
                        break;
                    }
                }
            }
            result = (pos2 - pos1) * (pos4 - pos3);
        }
        return result;
    }
}
