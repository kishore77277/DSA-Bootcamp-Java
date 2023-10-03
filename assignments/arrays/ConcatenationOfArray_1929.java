package arrays;

public class ConcatenationOfArray_1929 {

    public int[] getConcatenation(int[] nums) {
        // return bruteForce(nums, nums.length);
        return optimal(nums, nums.length);
    }

    // running two loops first fill n
    // then fill next n on second pass
    public int[] bruteForce(int[] nums, int n) {
        int[] answer = new int[2 * n];
        for (int i = 0; i < n; i++) {
            answer[i] = nums[i];
        }
        int index = n;
        for (int i = 0; i < n; i++) {
            answer[index++] = nums[i];
        }
        return answer;
    }

    // doing it in one pass
    // ans[i] = ans[i + n] = nums[i];
    public int[] optimal(int[] nums, int n) {
        int[] answer = new int[2 * n];
        for (int i = 0; i < n; i++) {
            answer[i] = nums[i];
            answer[i + n] = nums[i];
        }
        return answer;
    }
}
