package Day_5;

import java.util.*;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        
        // Start from the last element, which is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Leaders are collected in reverse order, so reverse the list
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);

        System.out.println("Leaders: " + leaders);
    }
}
