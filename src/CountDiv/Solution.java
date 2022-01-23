package CountDiv;

public class Solution {
    public int solution(int A, int B, int K) {

        int a = A % K;
        int b = B % K;
        int start = A + (K - a);
        int end = B - b;
        if (a == 0)
        {
            start = A;
        }
        if (b == 0)
        {
            end = B;
        }
        int dif = end - start;

        if (dif >= 0)
        {
            return dif/K + 1;
        }
        return 0;
    }
}
