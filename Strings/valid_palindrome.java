// Problem: Valid Palindrome
// Description: Check whether a string reads the same forward and backward
// (ignoring special characters and case)

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            char leftChar = input.charAt(start);
            char rightChar = input.charAt(end);

            // Move start if not alphanumeric
            if (!Character.isLetterOrDigit(leftChar)) {
                start++;
                continue;
            }

            // Move end if not alphanumeric
            if (!Character.isLetterOrDigit(rightChar)) {
                end--;
                continue;
            }

            // Compare after converting to lowercase
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
