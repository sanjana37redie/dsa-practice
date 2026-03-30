// Problem: First Unique Character in a String
// Description: Return index of first non-repeating character

class UniqueCharacterFinder {

    public int getFirstUniqueIndex(String text) {

        int[] frequency = new int[26];

        // Count occurrences
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
