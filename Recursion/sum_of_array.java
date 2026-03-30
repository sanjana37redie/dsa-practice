// Problem: Sum of elements in array using recursion

class ArraySum {

    public int findSum(int[] arr, int index) {

        if (index == arr.length) {
            return 0;
        }

        return arr[index] + findSum(arr, index + 1);
    }
}
