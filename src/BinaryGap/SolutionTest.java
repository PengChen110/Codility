package BinaryGap;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int N = 1041;
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.solution(N));
    }

    @Test
    public void testCase1()
    {
        int N = 1040;
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.solution(N));
    }
}
