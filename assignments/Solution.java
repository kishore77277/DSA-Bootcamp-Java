import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
//        System.out.println(new Solution().minimizedMaximum(7, new int[]{15, 10, 10}));

//        int[][] grid = new int[5][4];
//        System.out.println(uniquePathsInGridPrintAll(grid, 0, 0, ""));

        int[] arr = {1, 2, 3};

    }

    public static int uniquePathsInGrid(int[][] grid, int row, int col) {
        if (row == grid.length - 1 || col == grid[0].length - 1) {
            return 1;
        }
        int down = uniquePathsInGrid(grid, row + 1, col);
        int right = uniquePathsInGrid(grid, row, col + 1);
        return down + right;
    }

    public static int uniquePathsInGridPrintAll(int[][] grid, int row, int col, String path) {
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            System.out.println(path);
            return 1;
        }
        int count = 0;
        if (row < grid.length) {
            count = count + uniquePathsInGridPrintAll(grid, row + 1, col, path + "D");
        }
        if (col < grid[0].length) {
            count = count + uniquePathsInGridPrintAll(grid, row, col + 1, path + "R");
        }
        return count;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        return binarySearch(quantities, quantities.length, n);
    }

    public boolean isPossible(int[] quantities, int n, int maxQuantity,int maxStoresCount) {
        int currentStoresCount = 0;
        for (int i = 0; i < n; i++) {
            currentStoresCount = currentStoresCount + (int)Math.ceil(quantities[i] / maxQuantity);
            if (currentStoresCount > maxStoresCount) {
                return false;
            }
        }
        return true;
    }

    public int binarySearch(int[] nums, int n, int k) {
        int start = 1;
        int end = findMax(nums, n);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println("quant : " + mid + " result : " + isPossible(nums, n, mid, k));
            if (isPossible(nums, n, mid, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int findMax(int[] nums, int n) {
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}