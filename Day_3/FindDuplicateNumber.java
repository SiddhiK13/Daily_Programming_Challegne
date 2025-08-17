public class FindDuplicateNumber {
    public static int findDuplicate(int[] arr) {
        // Phase 1: Detect intersection point of cycle
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to cycle (duplicate number)
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr));

        int[] arr2 = {1, 4, 6, 3, 2, 5, 6};
        System.out.println("Duplicate number: " + findDuplicate(arr2));

        int[] arr3 = {2, 2, 2, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr3));
    }
}
