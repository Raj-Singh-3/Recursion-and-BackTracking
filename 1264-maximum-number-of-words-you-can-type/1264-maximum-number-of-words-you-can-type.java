class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split("\\s+");
        int count = 0;
        for(int i = 0 ;i<arr.length;i++)
        {
            String s = arr[i];
            int flag = 0;
            for(int j = 0;j<brokenLetters.length();j++)
            {
                if(s.contains(""+brokenLetters.charAt(j))) 
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) count++;
        } 
        return count;       
    }
}