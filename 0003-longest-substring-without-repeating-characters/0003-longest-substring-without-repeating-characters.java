class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> ht = new HashMap<>();
        int l = 0, r = 0, maxLen = 0, n = s.length();
        while(r<n)
        {
            char ch = s.charAt(r);
            if(ht.containsKey(ch))
            {
                l = Math.max(l, ht.get(ch) + 1);
                ht.remove(ch);
            }
            ht.put(ch,r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}