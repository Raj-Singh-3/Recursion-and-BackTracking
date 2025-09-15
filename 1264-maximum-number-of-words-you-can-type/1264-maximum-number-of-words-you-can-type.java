class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split("\\s+");
        int count = 0;
        HashSet<Character> ht = new HashSet<>();
        for (char ch : brokenLetters.toCharArray()) {
            ht.add(ch);
        }
        for(int i = 0 ;i<arr.length;i++)
        {
            String s = arr[i];
            int flag = 0;
            for(int j = 0;j<s.length();j++)
            {
                if(ht.contains(s.charAt(j)))
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