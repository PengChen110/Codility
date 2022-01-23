package GenomicRangeQuery;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] results = {2, 4, 1};
        Solution solution = new Solution();
        Assert.assertArrayEquals(results, solution.solution(S, P, Q));
    }
}
