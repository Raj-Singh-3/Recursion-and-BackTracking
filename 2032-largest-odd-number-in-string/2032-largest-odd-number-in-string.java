class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s = new StringBuilder("");
        for(int i = num.length()-1;i>=0;i--)
        {
            int val = Integer.parseInt(""+ num.charAt(i));
            if(val%2!=0)
            {
                s.append(num.substring(0,i+1));
                break;
            }
        }
        return s.toString();
    }
}