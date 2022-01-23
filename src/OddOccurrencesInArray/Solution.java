package OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int unPaired = A[0];
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i = i + 2)
        {
            if (A[i] != A[i + 1])
            {
                unPaired = A[i];
                break;
            }
            if (i == A.length - 3)
            {
                unPaired = A[A.length - 1];
            }
        }
        return unPaired;
    }
}
