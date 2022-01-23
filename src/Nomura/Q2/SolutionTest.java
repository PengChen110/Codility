package Nomura.Q2;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int[] A = {3, 2, 3, 2, 3};
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.solution(A));
    }

    @Test
    public void testCase1()
    {
        int[] A = {7, 4, -2, 4, -2, -9};
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(A));
    }

    @Test
    public void testCase2()
    {
        int[] A = {7, -5, -5, -5, 7, -1, 7};
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.solution(A));
    }

    @Test
    public void testCase3()
    {
        int[] A = {4};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A));
    }
}
