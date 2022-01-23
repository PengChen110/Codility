package FrogRiverOne;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.solution(X, A));
    }

    @Test
    public void testCase1()
    {
        int[] A = {1};
        int X = 1;
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(X, A));
    }
}
