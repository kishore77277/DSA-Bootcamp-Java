package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs_1512 {

    public int numIdenticalPairs(int[] nums) {
        // return bruteForce(nums, nums.length);
        return hashing(nums, nums.length);
    }

    public int bruteForce(int[] nums, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public int hashing(int[] nums, int n) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(nums[i], -1);
            if (value == -1) {
                map.put(nums[i], 1);
            } else {
                count = count + value;
                map.put(nums[i], value + 1);
            }
        }
        return count;
    }
}
