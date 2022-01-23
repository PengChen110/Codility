package Ali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LFU {

    HashMap<Integer, String> cacheMap;
    HashMap<Integer, Integer> freqMap;
    int capacity;

    public int get(int key)
    {
        if (cacheMap.containsKey(key))
        {
            int currFreq = freqMap.get(key);
            freqMap.put(key, currFreq + 2);
            return key;
        }
        else
        {
            return -999;
        }
    }

    public void put(int key, String value)
    {
        if (cacheMap.size() < capacity)
        {
            cacheMap.put(key, value);
            int currFreq = freqMap.get(key);
            freqMap.put(key, currFreq + 1);
        }
        else
        {
            gc();
        }
    }

    private void gc()
    {
        ArrayList<Integer> mapValues = new ArrayList<>(freqMap.values());
        Collections.sort(mapValues);
        freqMap.remove(mapValues.get(0));
    }
}
