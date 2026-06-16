class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder st = new StringBuilder();
        for(int i = 0;i<n;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                st.append(""+s.charAt(i));
            }
            else if(i == 0 && s.charAt(i) == '#')
            {
                st.append("");
            }
            else if(s.charAt(i) == '#')
            {
                st.append(st.toString());
            }
            else if(s.charAt(i) == '%')
            {
                st.reverse();
            }
            else if(st.length()>0 && s.charAt(i) == '*')
            {
               st.deleteCharAt(st.length()-1); 
            }
        }
        return st.toString();
    }
}