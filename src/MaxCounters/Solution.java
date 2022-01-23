package MaxCounters;

import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currMax = 0;
        for (int i = 0; i < A.length; i++)
        {
            int index = A[i] - 1;
            if (A[i] != N + 1)
            {
                counters[index] += 1;
                if (counters[index] > currMax)
                {
                    currMax = counters[index];
                }
            }
            else
            {
                Arrays.fill(counters, currMax);
            }
        }
        return counters;
    }
}
