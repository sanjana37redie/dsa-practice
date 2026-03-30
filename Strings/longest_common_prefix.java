// Problem: Longest Common Prefix
// Description: Find the longest starting substring common to all strings

class PrefixFinder {

    public String getCommonPrefix(String[] words) {

        if (words == null || words.length == 0) {
            return "";
        }

        String result = words[0];

        for (int i = 1; i < words.length; i++) {

            while (!words[i].startsWith(result)) {

                result = result.substring(0, result.length() - 1);

                if (result.length() == 0) {
                    return "";
                }
            }
        }

        return result;
    }
}
