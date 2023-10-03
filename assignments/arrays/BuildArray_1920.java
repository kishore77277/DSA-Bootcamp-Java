package arrays;

public class BuildArray_1920 {

    public int[] buildArray(int[] nums) {
        // return bruteForce(nums, nums.length);
        return optimal(nums, nums.length);
    }

    // self-explanatory
    public int[] bruteForce(int[] nums, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }

    // inplace
    // storing two numbers at one place
    // taking one number that is not in array
    // our case n
    // then adding current element to target element * n times
    // so that next time if we divide with n we get nums[nums[i]]
    // if we do % then we will get prev number what was there before
    public int[] optimal(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }
}
