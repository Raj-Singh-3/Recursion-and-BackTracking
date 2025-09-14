class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n = s.length();
        HashMap<Character,Integer> ht = new HashMap<>();
        for(int i = 0;i<n;i++)
        {
            char ch = s.charAt(i);
            ht.put(ch, ht.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i<n;i++)
        {
            char ch = t.charAt(i);
            if(!ht.containsKey(ch)) return false;
            else
            {
                ht.put(ch, ht.get(ch)-1);
                if(ht.get(ch) == 0) ht.remove(ch);
            }
        }
        return true;
    }
}