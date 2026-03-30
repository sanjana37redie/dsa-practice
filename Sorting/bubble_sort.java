// Problem: Bubble Sort
// Repeatedly swap adjacent elements if they are in wrong order

class BubbleSorter {

    public void sort(int[] arr) {

        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {

            boolean swapped = false;

            for (int i = 0; i < n - pass - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }
}
