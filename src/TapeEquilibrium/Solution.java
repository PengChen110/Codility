package TapeEquilibrium;

public class Solution {
    public int solution(int[] A) {
        int minDiff = Integer.MAX_VALUE;

        int currLeft = 0;
        int[] sumLeft = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            sumLeft[i] = A[i] + currLeft;
            currLeft = sumLeft[i];
        }

        int currRight = 0;
        int[] sumRight = new int[A.length - 1];
        for (int i = A.length - 1; i > 0; i--)
        {
            sumRight[i - 1] = A[i] + currRight;
            currRight = sumRight[i - 1];
        }

        for (int i = 0; i < sumLeft.length; i++)
        {
            int diff = Math.abs(sumLeft[i] - sumRight[i]);
            if (diff < minDiff)
            {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
