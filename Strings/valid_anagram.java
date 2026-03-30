/ Problem: Valid Anagram
// Description: Check if two strings contain same characters in different order

class AnagramChecker {

    public boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        int[] letterCount = new int[26];

        // Count characters from first string
        for (int i = 0; i < first.length(); i++) {
            letterCount[first.charAt(i) - 'a']++;
        }

        // Subtract using second string
        for (int i = 0; i < second.length(); i++) {
            letterCount[second.charAt(i) - 'a']--;
        }

        // Check if all values are zero
        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
