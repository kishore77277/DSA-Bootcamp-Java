✅Brute | Optimal | O(N) Time complexity, explained cleanly✅

# Approach 1: Brute Force
**STEPS:**

1. Running a loop on ```nums``` and every time couting the digits of each number.
2. if that ```digitCount``` is ```even``` then increasing the counter.
3. returing the counter.
# Complexity
- Time complexity: $$O(N * logN)$$
    - for every number in nums array we need to calculate ```digitcount``` that take ```logN``` time.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findNumbers(int[] nums) {
        return bruteForce(nums);
    }

    public int bruteForce(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((getDigitCount(num) & 1) == 0) {
                count++;
            }
        }
        return count;
    }

    public int getDigitCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
```

# Approach 2: Optimal (Uisng Math)
we can get no of digits in number by using math trick.

    Number of digits = Math.log10(num) + 1
**STEPS:**

1. Running a loop on ```nums``` and every time couting the digits of each number using formula ```Math.log10(num) + 1;```
2. if that ```digitCount``` is ```even``` then increasing the counter.
3. returing the counter.
# Complexity
- Time complexity: $$O(N)$$
    - for every number in nums array we need to calculate ```digitcount``` that take ```logN``` time.
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findNumbers(int[] nums) {
        return optimal(nums);
    }

    public int optimal(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitCount = (int)Math.log10(num) + 1;
            if (digitCount % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
}
```