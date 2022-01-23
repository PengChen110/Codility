package Nomura.Q3;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        String S = "babaa";
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(S));
    }

    @Test
    public void testCase1()
    {
        String S = "ababa";
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(S));
    }

    @Test
    public void testCase2()
    {
        String S = "aba";
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(S));
    }

    @Test
    public void testCase3()
    {
        String S = "bbbbb";
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(S));
    }
}
