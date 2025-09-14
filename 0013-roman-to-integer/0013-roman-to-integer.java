class Solution {
public int romanToInt(String s) {
        HashMap<Character,Integer> ht = new HashMap<>();
        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);
        int sum = 0;
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            int x = ht.get(ch);
            if (i + 1 < s.length())
            {
                if (x < ht.get(s.charAt(i + 1))) 
                {
                    sum -= x;
                } 
                else 
                {
                    sum += x;
                }
            }
            else sum += x;
        }
        return sum;
    }
}