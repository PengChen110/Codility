package TapeEquilibrium;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCase0()
    {
        int[] A = {3, 1, 2, 4, 3};
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.solution(A));
    }
}
