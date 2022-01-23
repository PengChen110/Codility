package PermMissingElem;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        if (A.length == 0)
        {
            return 1;
        }
        Arrays.sort(A);
        int missingElem = A[A.length - 1] + 1;
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] != i + 1)
            {
                missingElem = A[i] - 1;
                break;
            }
        }
        return missingElem;
    }
}
