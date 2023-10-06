package arrays;

public class MaximumPopulationYear_1854 {

    public int maximumPopulation(int[][] logs) {
        return prefixSumOptimal(logs);
    }

    public int bruteForce(int[][] logs) {
        int m = logs.length;
        int n = logs[0].length;
        int[] hash = new int[101];
        for (int[] log : logs) {
            int birthYear = log[0];
            int deathYear = log[1];
            for (int i = birthYear; i < deathYear; i++) {
                hash[i - 1950]++;
            }
        }
        int maxPopulation = 0;
        int maxPopulationYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (hash[i] > maxPopulation) {
                maxPopulation = hash[i];
                maxPopulationYear = i + 1950;
            }
        }
        return maxPopulationYear;
    }

    public int prefixSumOptimal(int[][] logs) {
        int m = logs.length;
        int n = logs[0].length;
        int[] population = new int[101];
        for (int[] log : logs) {
            int birthYear = log[0];
            int deathYear = log[1];
            population[birthYear - 1950]++;
            population[deathYear - 1950]--;
        }
        int maxPopulation = 0;
        int maxPopulationYear = 1950;
        int prefixSum = 0;
        for (int i = 0; i < 101; i++) {
            prefixSum = prefixSum + population[i];
            if (prefixSum > maxPopulation) {
                maxPopulation = prefixSum;
                maxPopulationYear = i + 1950;
            }
        }
        return maxPopulationYear;
    }
}
