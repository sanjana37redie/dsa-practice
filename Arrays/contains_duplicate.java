// Problem: Contains Duplicate
// Description: Check if any value appears more than once in the array
// Approach: Use HashSet to track seen elements
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

class DuplicateChecker {

    public boolean checkDuplicates(int[] arr) {

        HashSet<Integer> seenValues = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            // If already seen, duplicate exists
            if (!seenValues.add(current)) {
                return true;
            }
        }

        return false; // no duplicates found
    }
}
