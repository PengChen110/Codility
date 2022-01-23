package BinaryGap;

public class Solution {
    public int solution(int N) {
        String s = Integer.toBinaryString(N);
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) == '1')
            {
                s = s.substring(0, i + 1);
                break;
            }
        }
        System.out.println(s);
        int maxLen = 0;
        int curLen = 0;
        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
            {
                if (maxLen < curLen)
                {
                    maxLen = curLen;
                }
                curLen = 0;
            }
            else if (s.charAt(i) == '0')
            {
                curLen++;
            }
        }
        return maxLen;
    }
}
