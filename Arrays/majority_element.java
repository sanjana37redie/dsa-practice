// Problem: Majority Element
// Description: Find the element that appears more than n/2 times
// Approach: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

class MajorityFinder {

    public int getMajorityElement(int[] arr) {

        int potential = 0;
        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {

            if (frequency == 0) {
                potential = arr[i];
                frequency = 1;
            } else if (arr[i] == potential) {
                frequency++;
            } else {
                frequency--;
            }
        }

        return potential;
    }
}
