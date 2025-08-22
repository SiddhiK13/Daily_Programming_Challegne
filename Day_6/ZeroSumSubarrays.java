import java.util.*;

public class ZeroSumSubarrays {
    public static List<int[]> findSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int prefixSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            // Case 1: Subarray from 0 to i
            if (prefixSum == 0) {
                result.add(new int[]{0, i});
            }
            
            // Case 2: Subarray with same prefix sum
            if (map.containsKey(prefixSum)) {
                for (int startIndex : map.get(prefixSum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }
            
            // Store current prefix sum index
            map.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> subarrays = findSubarrays(arr);

        for (int[] pair : subarrays) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
