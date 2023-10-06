package arrays;

public class FlippingAnImage_832 {

    public int[][] flipAndInvertImage(int[][] image) {
        // return bruteForce(image);
        // return inPlace(image);
        return optimal(image);
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
