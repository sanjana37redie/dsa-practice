// Problem: Maximum Subarray
// Description: Find the largest sum of any contiguous subarray
// Approach: Kadane’s Algorithm (dynamic accumulation)
// Time Complexity: O(n)
// Space Complexity: O(1)

class MaxSubarraySolution {

    public int findMaxSum(int[] arr) {

        int bestSum = Integer.MIN_VALUE;
        int runningSum = 0;

        for (int value : arr) {

            // Add current element to running sum
            runningSum += value;

            // Update best sum if current is greater
            if (runningSum > bestSum) {
                bestSum = runningSum;
            }

            // Reset if sum becomes negative
            if (runningSum < 0) {
                runningSum = 0;
            }
        }

        return bestSum;
    }
}
