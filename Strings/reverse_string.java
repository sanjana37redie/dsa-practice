// Problem: Reverse String
// Description: Reverse the given character array in-place

class StringReverser {

    public void reverseArray(char[] input) {

        int leftIndex = 0;
        int rightIndex = input.length - 1;

        while (leftIndex < rightIndex) {

            char temp = input[leftIndex];
            input[leftIndex] = input[rightIndex];
            input[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }
    }
}
