class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for(int i = 0;i<words.length;i++)
        {
            String s = words[i];
            int sum = 0;
            for(int j = 0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                int idx = ch-'a';
                sum+=weights[idx];
            }
            int tempResult = sum%26;
            res += (char)('z'- (char)tempResult);
        }
        return res;
    }
}