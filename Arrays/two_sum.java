// Problem: Two Sum
// Description: Find indices of two numbers such that they add up to target
// Approach: Use HashMap to store visited elements
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class TwoSumSolution {
    public int[] findTwoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int index = 0; index < numbers.length; index++) {

            int current = numbers[index];
            int required = target - current;

            // Check if required number already exists
            if (visited.containsKey(required)) {
                return new int[]{visited.get(required), index};
            }

            // Store current number with its index
            visited.put(current, index);
        }

        return new int[]{-1, -1}; // if no solution found
    }
}
