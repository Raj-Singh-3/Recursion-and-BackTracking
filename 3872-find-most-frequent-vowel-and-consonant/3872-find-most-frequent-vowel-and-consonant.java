class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> ht1 = new HashMap<>();
        HashMap<Character,Integer> ht2 = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
            {
                ht1.put(ch,ht1.getOrDefault(ch,0)+1);
            }
            else
            {
                ht2.put(ch,ht2.getOrDefault(ch,0)+1);
            }
        }
        int max1 = 0;
        for(var e: ht1.entrySet())
        {
           max1 = Math.max(e.getValue(),max1);
        }
        int max2 = 0;
        for(var e: ht2.entrySet())
        {
           max2 = Math.max(e.getValue(),max2);
        }
        return max1+max2;
    }
}