package PermMissingElem;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int[] A = {2, 3, 1, 5};
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(A));
    }

    @Test
    public void testCase1()
    {
        int[] A = {2, 3, 4, 5};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A));
    }

    @Test
    public void testCase2()
    {
        int[] A = {2, 3, 1, 4};
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.solution(A));
    }

    @Test
    public void testCase3()
    {
        int[] A = {};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A));
    }
}
