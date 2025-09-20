class Solution {
    public long smallestNumber(long num) {
        if (num == 0) return 0;
        String s = "" + num;
        long x = 0;

        if (s.charAt(0) == '-') {
            ArrayList<Character> s1 = new ArrayList<>();
            int zeroes = 0;

            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != '0') {
                    s1.add(s.charAt(j));
                } else {
                    zeroes++;
                }
            }

            Collections.sort(s1, (a, b) -> b - a);

            StringBuilder res = new StringBuilder("-");
            for (char c : s1) res.append(c);
            for (int i = 0; i < zeroes; i++) res.append('0');

            x = Long.parseLong(res.toString()); // already negative
        } 
        else {
            ArrayList<Character> s1 = new ArrayList<>();
            int zeroes = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != '0') {
                    s1.add(s.charAt(j));
                } else {
                    zeroes++;
                }
            }

            Collections.sort(s1);

            StringBuilder res = new StringBuilder();
            res.append(s1.get(0));  // smallest non-zero
            for (int i = 0; i < zeroes; i++) res.append('0');
            for (int i = 1; i < s1.size(); i++) res.append(s1.get(i));

            x = Long.parseLong(res.toString());
        }

        return x;
    }
}
