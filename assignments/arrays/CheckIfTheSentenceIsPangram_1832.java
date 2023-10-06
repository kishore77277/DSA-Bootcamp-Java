package arrays;

import java.util.TreeSet;

public class CheckIfTheSentenceIsPangram_1832 {

    public boolean checkIfPangram(String sentence) {
        // return bruteForce(sentence);
        // return hashing(sentence);
        // return optimalUsingTreeset(sentence);
        return bitManupulation(sentence);
    }

    public boolean bruteForce(String sentence) {
        for (int i = 0; i < 26; i++) {
            boolean found = false;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == 'a' + i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public boolean hashing(String sentence) {
        int[] hash = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            int key = sentence.charAt(i) - 'a';
            hash[key]++;
        }
        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean optimalUsingTreeset(String sentence) {
        TreeSet<Character> set = new TreeSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        return set.size() == 26;
    }

    public boolean bitManupulation(String sentence) {
        int hash = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            hash = hash | 1 << (ch - 'a');
        }
        return hash == (int) Math.pow(2, 26) - 1;
    }
}
