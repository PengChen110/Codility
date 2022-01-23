package MaxCounters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] results = {3, 2, 2, 4, 2};
        Solution solution = new Solution();
        Assert.assertArrayEquals(results, solution.solution(N, A));
    }

    @Test
    public void testCase1()
    {
        int N = 5;
        int[] A = {3, 4, 4, 1, 4, 4, 6};
        int[] results = {4, 4, 4, 4, 4};
        Solution solution = new Solution();
        Assert.assertArrayEquals(results, solution.solution(N, A));
    }

    @Test
    public void testCase2()
    {
        int N = 5;
        int[] A = {6, 3, 4, 4, 1, 4, 4};
        int[] results = {1, 0, 1, 4, 0};
        Solution solution = new Solution();
        Assert.assertArrayEquals(results, solution.solution(N, A));
    }
}
