#Maximum Square Area by Removing Fences From a Field


import java.util.*;

class Solution1 {
    static final long MOD = 1_000_000_007;

    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {

  
        int[] h = addBoundaries(hFences, m);
        int[] v = addBoundaries(vFences, n);

        Set<Integer> hDiff = getAllDifferences(h);
        Set<Integer> vDiff = getAllDifferences(v);

        int maxSide = 0;

        for (int d : hDiff) {
            if (vDiff.contains(d)) {
                maxSide = Math.max(maxSide, d);
            }
        }

        if (maxSide == 0) return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
    }

    private int[] addBoundaries(int[] fences, int limit) {
        int[] arr = new int[fences.length + 2];
        arr[0] = 1;
        arr[1] = limit;
        System.arraycopy(fences, 0, arr, 2, fences.length);
        Arrays.sort(arr);
        return arr;
    }

    private Set<Integer> getAllDifferences(int[] arr) {
        Set<Integer> diffs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diffs.add(arr[j] - arr[i]);
            }
        }
        return diffs;
    }
}
