package main.resolutions.twoSum;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        System.out.println("target: " + target);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("encontramos os numeros no indice: " + i + " e " + j);
                    System.out.println("encontramos os numeros: " + nums[i] + " e " + nums[j]);
                    return new int[]{i, j};
                }

            }
        }
        return nums;
    }
}
