class Solution {
    public String removeOuterParentheses(String s) {
        int balance = 0;
        int n = s.length();
        StringBuilder t = new StringBuilder();
        for(int i = 0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                if(balance>0)
                {
                    t.append(ch);
                }
                balance++;
            }
            else
            {
                balance--;
                if(balance>0)
                {
                    t.append(ch);
                }
            }
        }
        return t.toString();
    }
}