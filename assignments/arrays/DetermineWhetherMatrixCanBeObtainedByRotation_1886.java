package arrays;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation_1886 {

    public boolean findRotation(int[][] mat, int[][] target) {
        return optimalInplace(mat, target);
    }

    public boolean bruteForce(int[][] mat, int[][] target) {
        for (int i = 1; i <= 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = mat[n - j - 1][i];
            }
        }
        return result;
    }

    public boolean optimalInplace(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 1; i <= 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotateInplace(mat);
        }
        return false;
    }

    public void rotateInplace(int[][] mat) {
        transpose(mat);
        for (int i = 0; i < mat.length; i++) {
            reverse(mat[i]);
        }
    }

    public void transpose(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }
    }

    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
