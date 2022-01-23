package FrogJmp;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int X = 10;
        int Y = 85;
        int D = 30;
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.solution(X, Y, D));
    }

    @Test
    public void testCase1()
    {
        int X = 10;
        int Y = 10;
        int D = 30;
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.solution(X, Y, D));
    }

    @Test
    public void testCase2()
    {
        int X = 10;
        int Y = 70;
        int D = 30;
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.solution(X, Y, D));
    }
}
