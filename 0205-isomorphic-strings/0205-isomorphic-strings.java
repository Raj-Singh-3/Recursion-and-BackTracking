class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> ht1 = new HashMap<>();
        HashMap<Character, Character> ht2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(ht1.containsKey(c1))
            {
                if(ht1.get(c1)!=c2) return false;
            }
            else ht1.put(c1,c2);

            if(ht2.containsKey(c2))
            {
                if(ht2.get(c2)!=c1) return false;
            }
            else ht2.put(c2,c1);
        }
        return true;
    }
}