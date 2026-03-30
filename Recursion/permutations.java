// Problem: Generate all permutations

import java.util.*;

class PermutationGenerator {

    public List<List<Integer>> generate(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    private void permute(int[] nums, int index,
                         List<List<Integer>> result) {

        if (index == nums.length) {

            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);

            result.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);
            permute(nums, index + 1, result);
            swap(nums, index, i);
        }
    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
