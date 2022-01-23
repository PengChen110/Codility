package CyclicRotation;

public class Solution {
    public int[] solution(int[] A, int K) {
        int[] B = A.clone();
        for (int i = 0; i < A.length; i++)
        {
            int index = (i + K) % A.length;
            A[index] = B[i];
        }
        return A;
    }
}
