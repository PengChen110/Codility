package PermCheck;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int[] A = {4, 1, 3, 2};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A));
    }

    @Test
    public void testCase1()
    {
        int[] A = {4, 1, 3};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(A));
    }

    @Test
    public void testCase2()
    {
        int[] A = {1};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A));
    }

    @Test
    public void testCase3()
    {
        int[] A = {2};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(A));
    }

    @Test
    public void testCase4()
    {
        int[] A = {3, 2};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(A));
    }

    @Test
    public void testCase5()
    {
        int[] A = {1, 3, 2, 2};
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(A));
    }
}
