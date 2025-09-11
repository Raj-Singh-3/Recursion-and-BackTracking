class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(isVowel(c))
            {
                Integer b = (int)c;
                arr.add(b);
            }
            
        }
        StringBuilder s1 = new StringBuilder(s);
        Collections.sort(arr);
        int j = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                s1.setCharAt(i,(char) arr.get(j).intValue());
                j++;
            }
        }
        return s1.toString();
    }
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch == 'u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') return true;
        return false;
    }
}