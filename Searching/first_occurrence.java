// Problem: First Occurrence of element

class FirstOccurrenceFinder {

    public int findFirst(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid - 1; // move left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
