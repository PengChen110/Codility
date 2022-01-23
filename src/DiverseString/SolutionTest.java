package DiverseString;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testCase0()
    {
        int A = 6;
        int B = 1;
        int C = 1;
        Solution solution = new Solution();
        System.out.println(solution.solution(A, B, C));
    }

    @Test
    public void testCase1()
    {
        int A = 1;
        int B = 3;
        int C = 1;
        Solution solution = new Solution();
        System.out.println(solution.solution(A, B, C));
    }

    @Test
    public void testCase2()
    {
        int A = 0;
        int B = 1;
        int C = 8;
        Solution solution = new Solution();
        System.out.println(solution.solution(A, B, C));
    }
}
