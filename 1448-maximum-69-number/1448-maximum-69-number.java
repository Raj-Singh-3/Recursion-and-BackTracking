class Solution {
    public int maximum69Number (int num) {
        String a = ""+num;
        String b;
        int sum = 0; 
        int prev = 0;
        int i = 0;  
        int flag = 0;
        while(i<a.length())
        {
            if(a.charAt(i)=='6')
            {
                b = ""+a.substring(0,i)+'9'+a.substring(i+1,a.length());
                prev = Integer.parseInt(b);
                flag = 1;
            }
            if(prev>sum)
            {
                sum = prev;
            }
            i++;
        }
        if(flag == 0)
        {
            return num;
        }
        return sum;
    }
}