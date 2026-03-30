// Problem: Move Zeroes
// Description: Shift all zero values to the end while keeping order of non-zero elements
// Approach: Two-pointer (swap technique)
// Time Complexity: O(n)
// Space Complexity: O(1)

class MoveZeroesSolution {

    public void shiftZeroes(int[] arr) {

        int left = 0; // points to position for next non-zero

        for (int right = 0; right < arr.length; right++) {

            // When a non-zero element is found
            if (arr[right] != 0) {

                // Swap elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }
    }
}
