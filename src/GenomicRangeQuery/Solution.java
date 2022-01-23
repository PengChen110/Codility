package GenomicRangeQuery;

import java.util.HashMap;

public class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A', 1);
        hashMap.put('C', 2);
        hashMap.put('G', 3);
        hashMap.put('T', 4);
        int[] results = new int[P.length];
        for (int i = 0; i < P.length; i++)
        {
            int minFactor = 5;
            String dna = S.substring(P[i], Q[i] + 1);
            for (int j = 0; j < dna.length(); j++)
            {
                int factor = hashMap.get(dna.charAt(j));
                if (factor == 1)
                {
                    results[i] = 1;
                    break;
                }
                else
                {
                    if (factor < minFactor)
                    {
                        minFactor = factor;
                        results[i] = minFactor;
                    }
                }
            }
        }
        return results;
    }
}
