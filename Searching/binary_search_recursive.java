// Problem: Binary Search (Recursive)

class RecursiveBinarySearch {

    public int find(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return find(arr, target, start, mid - 1);
        } else {
            return find(arr, target, mid + 1, end);
        }
    }
}
