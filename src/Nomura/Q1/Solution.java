package Nomura.Q1;

import java.math.BigInteger;

public class Solution {
    public int solution(int A, int B) {
        BigInteger bigA = new BigInteger(String.valueOf(A));
        BigInteger bigB = new BigInteger(String.valueOf(B));
        String product = new BigInteger(String.valueOf(bigA.multiply(bigB)), 10).toString(2);
        int result = 0;
        for (int i = 0; i < product.length(); i++)
        {
            if (product.charAt(i) == '1')
            {
                result++;
            }
        }
        return result;
    }
}
