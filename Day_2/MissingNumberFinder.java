public class MissingNumberFinder {

    // Method 1: Using Sum Formula
    public static int findMissingUsingSum(int[] arr, int n) {
        long totalSum = (long) n * (n + 1) / 2; // Sum of 1 to n
        long arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return (int) (totalSum - arraySum);
    }

    // Method 2: Using XOR (Best for avoiding overflow)
    public static int findMissingUsingXOR(int[] arr, int n) {
        int xorAll = 0;
        int xorArr = 0;

        // XOR from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR with all elements of array
        for (int num : arr) {
            xorArr ^= num;
        }

        // Missing number
        return xorAll ^ xorArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Missing number: " + findMissingUsingSum(arr1, 5));
        System.out.println("Missing number (XOR): " + findMissingUsingXOR(arr1, 5));

        int[] arr2 = {2, 3, 4, 5};
        System.out.println("Missing number: " + findMissingUsingSum(arr2, 5));
        System.out.println("Missing number (XOR): " + findMissingUsingXOR(arr2, 5));

        int[] arr3 = {1, 2, 3, 4};
        System.out.println("Missing number: " + findMissingUsingSum(arr3, 5));
        System.out.println("Missing number (XOR): " + findMissingUsingXOR(arr3, 5));

        int[] arr4 = {1};
        System.out.println("Missing number: " + findMissingUsingSum(arr4, 2));
        System.out.println("Missing number (XOR): " + findMissingUsingXOR(arr4, 2));
    }
}
