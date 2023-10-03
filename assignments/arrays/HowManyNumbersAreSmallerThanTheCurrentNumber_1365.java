package arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        // return bruteForce(nums, nums.length);
        return hashing(nums, nums.length);
    }

    public int[] bruteForce(int[] nums, int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public int[] hashing(int[] nums, int n) {
        int[] hash = new int[101];
        for (int num : nums) {
            hash[num]++;
        }
        for (int i = 1; i < 101; i++) {
            hash[i] = hash[i] + hash[i - 1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = 0;
            } else {
                nums[i] = hash[nums[i] - 1];
            }
        }
        return nums;
    }
}
