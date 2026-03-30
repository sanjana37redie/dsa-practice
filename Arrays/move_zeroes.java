// Problem: Move Zeroes
// Move all zeros to end while maintaining order

class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int insertPos = 0;

        // Place all non-zero elements first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Fill remaining positions with zero
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
