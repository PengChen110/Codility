package CyclicRotation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] result = {9, 7, 6, 3, 8};
        Solution solution = new Solution();
        Assert.assertArrayEquals(result, solution.solution(A, K));
    }

    @Test
    public void testCase1()
    {
        int[] A = {0, 0, 0};
        int K = 1;
        int[] result = {0, 0, 0};
        Solution solution = new Solution();
        Assert.assertArrayEquals(result, solution.solution(A, K));
    }

    @Test
    public void testCase2()
    {
        int[] A = {1, 2, 3, 4};
        int K = 4;
        int[] result = {1, 2, 3, 4};
        Solution solution = new Solution();
        Assert.assertArrayEquals(result, solution.solution(A, K));
    }
}
