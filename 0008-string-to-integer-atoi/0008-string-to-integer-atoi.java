class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int i = 0, sign = 1;
        if(s.length() == 0) return 0;
        if(s.charAt(0)=='-'|| s.charAt(0) =='+')
        {
            sign = (s.charAt(i)== '-')? -1:1;
            i++;
        }
        long res = 0;
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int val = s.charAt(i) - '0';
            res = res*10 + val;
            i++;
            
            if(res*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(sign*res);
    }
}