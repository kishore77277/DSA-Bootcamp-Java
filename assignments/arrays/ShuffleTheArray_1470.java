package arrays;

public class ShuffleTheArray_1470 {

    public int[] shuffle(int[] nums, int n) {
        // return bruteForce(nums, n);
        // return bruteForceWithObservation(nums, n);
        // return logicalInplace(nums, n);
        return bitManupulation(nums, n);
    }

    public int[] bruteForce(int[] nums, int n) {
        int[] answer = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            answer[index++] = nums[i];
            answer[index++] = nums[i + n];
        }
        return answer;
    }

    public int[] bruteForceWithObservation(int[] nums, int n) {
        int[] answer = new int[2 * n];
        for (int i = 0; i < n; i++) {
            answer[2 * i] = nums[i];
            answer[2 * i + 1] = nums[i + n];
        }
        return answer;
    }

    public int[] logicalInplace(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i + n] = nums[i + n] + 10000 * nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[i + n] / 10000;
            nums[2 * i + 1] = nums[i + n] % 10000;
        }
        return nums;
    }

    public int[] bitManupulation(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i + n] = nums[i + n] << 10;
            nums[i + n] = nums[i + n] | nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[i + n] & 1023;
            nums[2 * i + 1] = nums[i + n] >> 10;
        }
        return nums;
    }
}
