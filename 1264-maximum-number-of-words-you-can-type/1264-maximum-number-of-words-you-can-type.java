import java.util.*;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Store broken letters in a HashSet for O(1) lookup
        Set<Character> brokenSet = new HashSet<>();
        for (char ch : brokenLetters.toCharArray()) {
            brokenSet.add(ch);
        }

        String[] words = text.split("\\s+"); // split by whitespace
        int count = 0;

        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (brokenSet.contains(c)) { // O(1) lookup
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }
}
