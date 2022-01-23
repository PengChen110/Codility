package MissingInteger;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] < 1)
        {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] <= 0)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        int[] B = new int[A.length - count];
        System.arraycopy(A, count, B, 0, A.length - count);
        if (B[0] != 1)
        {
            return 1;
        }
        for (int i = 0; i < B.length - 1; i++)
        {
            if (B[i + 1] - B[i] > 1)
            {
                return B[i] + 1;
            }
        }
        return B[B.length - 1] + 1;
    }
}
