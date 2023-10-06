package arrays;

public class FindTheHighestAltitude_1732 {

    public int largestAltitude(int[] gain) {
        // return usingPrefixSum(gain, gain.length);
        // return usingPrefixSumInplace(gain, gain.length);
        return optimal(gain, gain.length);
    }

    public int usingPrefixSum(int[] gain, int n) {
        int[] prefixSum = new int[n];
        prefixSum[0] = gain[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + gain[i];
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(prefixSum[i], max);
        }
        return max;
    }

    public int usingPrefixSumInplace(int[] gain, int n) {
        int max = gain[0];
        for (int i = 1; i < n; i++) {
            gain[i] = gain[i - 1] + gain[i];
            max = Math.max(gain[i], max);
        }
        return Math.max(0, max);
    }

    public int optimal(int[] gain, int n) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for (int i = 0; i < n; i++) {
            currentAltitude = currentAltitude + gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }
}
