package Nomura.Q1;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int A = 3;
        int B = 7;
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.solution(A, B));
    }

    @Test
    public void testCase1()
    {
        int A = 31111111;
        int B = 72222222;
        Solution solution = new Solution();
        System.out.println(solution.solution(A, B));
    }
}
