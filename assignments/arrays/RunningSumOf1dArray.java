package arrays;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        // return bruteForce(nums, nums.length);
        // return better(nums, nums.length);
        return optimal(nums, nums.length);
    }

    public int[] bruteForce(int[] nums, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + nums[j];
            }
            answer[i] = sum;
        }
        return answer;
    }

    public int[] better(int[] nums, int n) {
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = prefixSum[i];
        }
        return answer;
    }

    public int[] optimal(int[] nums, int n) {
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
