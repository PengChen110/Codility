package CountDiv;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int A = 6;
        int B = 11;
        int K = 2;
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.solution(A, B, K));
    }

    @Test
    public void testCase1()
    {
        int A = 6;
        int B = 6;
        int K = 2;
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A, B, K));
    }

    @Test
    public void testCase2()
    {
        int A = 7;
        int B = 11;
        int K = 2;
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(A, B, K));
    }

    @Test
    public void testCase3()
    {
        int A = 6;
        int B = 11;
        int K = 3;
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(A, B, K));
    }

    @Test
    public void testCase4()
    {
        int A = 6;
        int B = 12;
        int K = 2;
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.solution(A, B, K));
    }

    @Test
    public void testCase5()
    {
        int A = 1;
        int B = 1;
        int K = 11;
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(A, B, K));
    }

    @Test
    public void testCase6()
    {
        int A = 0;
        int B = 1;
        int K = 11;
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A, B, K));
    }

    @Test
    public void testCase7()
    {
        int A = 11;
        int B = 345;
        int K = 17;
        Solution solution = new Solution();
        Assert.assertEquals(20, solution.solution(A, B, K));
    }
}
