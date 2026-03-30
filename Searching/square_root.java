// Problem: Find square root using Binary Search

class SquareRootCalculator {

    public int getSqrt(int num) {

        int left = 0;
        int right = num;
        int answer = 0;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (mid * mid <= num) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
