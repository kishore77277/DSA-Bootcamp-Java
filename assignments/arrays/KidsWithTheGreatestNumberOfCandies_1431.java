package arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMax(candies, candies.length);
        List<Boolean> result = new ArrayList<>();
        for (int candyCount : candies) {
            if (candyCount + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public int findMax(int[] candies, int n) {
        int max = candies[0];
        for (int candyCount : candies) {
            max = Math.max(candyCount, max);
        }
        return max;
    }
}
