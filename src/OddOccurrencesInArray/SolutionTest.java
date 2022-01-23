package OddOccurrencesInArray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Solution solution = new Solution();
        Assert.assertEquals(7, solution.solution(A));
    }

    @Test
    public void testCase1()
    {
        int[] A = {9};
        Solution solution = new Solution();
        Assert.assertEquals(9, solution.solution(A));
    }

    @Test
    public void testCase2()
    {
        int[] A = {2, 2, 3, 3, 4};
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(A));
    }
}
