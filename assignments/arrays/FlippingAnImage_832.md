# Approach 1 : Brute Force (Using Extra space)
## Steps:
1. Create ```result``` matrix of exact size of given ```image```.
2. In first pass reverse each array in ```image``` and update ```result``` matrix.
3. In second pass flip each element in array and update ```result``` matrix.
4. Return ```result``` matrix.

# Complexity
- Time complexity: $$O(M * N)$$
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(M * N)$$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        return bruteForce(image);
    }

    public int[][] bruteForce(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] result = new int[n][m];
        // reversing each array
        for (int i = 0; i < n; i++) {
            flipImage(image[i]);
            result[i] = image[i];
        }
        // flipping each element
        for (int i = 0; i < n; i++) {
            invertImage(image[i]);
            result[i] = image[i];
        }
        return result;
    }

    public void flipImage(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void invertImage(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
}
```
# Approach 2 : Without Using Extra space
Changing given ```image``` itself, without using extra space as we did in prev solution.
## Steps:
2. In first pass reverse each array in ```image``` matrix.
3. In second pass flip each element in array in ```image``` matrix.
4. Return ```image``` matrix itself.

# Complexity
- Time complexity: $$O(M * N)$$
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        return bruteForce(image);
    }

    public int[][] inPlace(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        // reversing each array
        for (int i = 0; i < n; i++) {
            flipImage(image[i]);
        }
        // flipping each element
        for (int i = 0; i < n; i++) {
            invertImage(image[i]);
        }
        return image;
    }

    public void flipImage(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void invertImage(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
}
```

# Approach 3 : In one pass, Using bit manupulation
Changing given ```image``` itself, without using extra space, for flipping we use ```XOR``` operator.
**NOTE**

    0 ^ 1 = 1
    1 ^ 1 = 0
    We will just ```XOR``` our number with ```1```
## Steps:
1. In first pass reverse each array in ```image``` matrix, making flip also at a time.
2. Return ```image``` matrix itself.

# Complexity
- Time complexity: $$O(M * N)$$
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: $$O(1)$$
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        return optimal(image);
    }

   public int[][] optimal(int[][] image) {
        int m = image[0].length;
        for (int[] arr : image) {
            for (int j = 0; j < (m + 1) / 2; j++) {
                int temp = arr[j] ^ 1;
                arr[j] = arr[m - j - 1] ^ 1;
                arr[m - j - 1] = temp;
            }
        }
        return image;
    }
}
```