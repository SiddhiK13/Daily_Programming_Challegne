package Day_1;

import java.util.*;

public class SortColors {
    public static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    // Swap arr[mid] and arr[high]
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {0, 1, 2, 1, 0, 2, 1, 0},
            {2, 2, 2, 2},
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {2, 0, 1},
            {}
        };

        for (int[] testCase : testCases) {
            sortColors(testCase);
            System.out.print("[");
            for (int i = 0; i < testCase.length; i++) {
                System.out.print(testCase[i]);
                if (i < testCase.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
