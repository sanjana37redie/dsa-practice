// Problem: Counting Sort (for non-negative integers)

class CountingSorter {

    public void sort(int[] arr) {

        int max = 0;

        for (int num : arr) {
            if (num > max) max = num;
        }

        int[] count = new int[max + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
