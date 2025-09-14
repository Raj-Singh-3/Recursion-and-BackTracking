class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String res = "";
        for(int i = 0;i<s.length();i++)
        {
            for(int j = i;j<s.length();j++)
            {
                String s1 =  s.substring(i,j+1);
                if(isPalindrome(s1))
                {
                    if(s1.length()>max)
                    {
                        max = s1.length();
                        res = s1;
                    }
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String a)
    {
        int i = 0, j = a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}