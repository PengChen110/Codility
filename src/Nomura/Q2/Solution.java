package Nomura.Q2;

public class Solution {
    public int solution(int[] A) {
        int result = 0;
        if (A.length == 1)
        {
            return 1;
        }

        int lastEven = A[0];
        int lastEvenStart = 0;
        int lastOdd = A[1];
        int lastOddStart = 1;

        for (int i = 2; i < A.length; i++)
        {
            if (i % 2 == 0)
            {
                if (A[i] != lastEven)
                {
                    lastEven = A[i];
                    result = Math.max(result, i - Math.min(lastOddStart, lastEvenStart));
                    lastOddStart = i - 1;
                    lastEvenStart = i;
                }
            }
            else
            {
                if (A[i] != lastOdd)
                {
                    lastOdd = A[i];
                    result = Math.max(result, i - Math.min(lastOddStart, lastEvenStart));
                    lastOddStart = i;
                    lastEvenStart = i - 1;
                }
            }
        }
        return Math.max(result, A.length - Math.min(lastOddStart, lastEvenStart));
    }
}
