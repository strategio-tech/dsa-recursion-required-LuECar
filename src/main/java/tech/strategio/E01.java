package tech.strategio;

import java.util.*;

public class E01 {
    private static Map<Integer, Integer> cache = new HashMap<>(); // memoization cache

    public int getNthFib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int result = getNthFib(n - 1) + getNthFib(n - 2);
        cache.put(n, result);
        return result;
    }
}
