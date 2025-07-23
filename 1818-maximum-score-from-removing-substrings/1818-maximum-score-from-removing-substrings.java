class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return gainHelper(s, "ab", x, "ba", y);
        } else {
            return gainHelper(s, "ba", y, "ab", x);
        }
    }

    private int gainHelper(String s, String first, int firstValue, String second, int secondValue) {
        int total = 0;
        Stack<Character> stack = new Stack<>();

        // First pass: remove all "first" pattern (either "ab" or "ba")
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && 
                stack.peek() == first.charAt(0) && c == first.charAt(1)) {
                stack.pop();
                total += firstValue;
            } else {
                stack.push(c);
            }
        }

        // Convert stack to remaining string
        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.insert(0, stack.pop());
        }

        // Second pass: remove all "second" pattern
        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() &&
                stack.peek() == second.charAt(0) && c == second.charAt(1)) {
                stack.pop();
                total += secondValue;
            } else {
                stack.push(c);
            }
        }

        return total;
    }
}
