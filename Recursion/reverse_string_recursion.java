// Problem: Reverse String using Recursion

class RecursiveStringReverse {

    public String reverse(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
