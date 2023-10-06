package arrays;

import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormofInteger_989 {

    public static void main(String[] args) {

        AddtoArrayFormofInteger_989 obj = new AddtoArrayFormofInteger_989();
        System.out.println(obj.addToArrayForm(new int[] {9,9,9,9,9,9,9,9,9,9}, 1));

    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        return optimal(num, k);
    }

    // does not work
    // look at constraints
    // 1 <= num.length <= 104
    // 0 <= num[i] <= 9
    // num does not contain any leading zeros except for the zero itself.
    // 1 <= k <= 104
    public List<Integer> bruteForce(int[] num, int k) {
        long sum = 0;
        for (int value : num) {
            sum = sum * 10 + value;
        }
        sum = sum + k;
        System.out.println(sum);
        List<Integer> answer = new ArrayList<>();
        while (sum > 0) {
            long digit = sum % 10;
            answer.add(0, (int)digit);
            sum = sum / 10;
        }
        return answer;
    }

    // taking k as carry everytime
    // looping from last to first
    // at last if carry is still there
    // empty it until it's not there
    public List<Integer> optimal(int[] num, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            k = k + num[i];
            int digit = k % 10;
            answer.add(0, digit);
            k = k / 10;
        }
        // if still carry is there we need to add that as well
        while (k > 0) {
            answer.add(0, k % 10);
            k = k / 10;
        }
        return answer;
    }
}
