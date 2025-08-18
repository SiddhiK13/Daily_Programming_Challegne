import java.util.Arrays;

public class MergeSortedArrays {

    // Function to merge arr1[] and arr2[] in-place
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = (int) Math.ceil((double)(m + n) / 2.0);

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < (m + n)) {
                // i in arr1 and j in arr1
                if (i < m && j < m) {
                    if (arr1[i] > arr1[j]) {
                        swap(arr1, i, arr1, j);
                    }
                }
                // i in arr1 and j in arr2
                else if (i < m && j >= m) {
                    if (arr1[i] > arr2[j - m]) {
                        swap(arr1, i, arr2, j - m);
                    }
                }
                // i in arr2 and j in arr2
                else {
                    if (arr2[i - m] > arr2[j - m]) {
                        swap(arr2, i - m, arr2, j - m);
                    }
                }
                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (int) Math.ceil((double) gap / 2.0);
        }
    }

    // Helper function to swap
    private static void swap(int[] arr1, int i, int[] arr2, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
