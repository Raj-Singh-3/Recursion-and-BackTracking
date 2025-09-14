class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> ht = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            ht.put(s.charAt(i),ht.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<int[]> arr = new ArrayList<>();
        for (var e : ht.entrySet()) {
            char key = e.getKey();
            int value = e.getValue();
            int a1[] = new int[2];
            a1[0] = key;
            a1[1] = value;
            arr.add(a1);
        }
        Collections.sort(arr, (a,b)->b[1]-a[1]);
        StringBuilder st = new StringBuilder("");
        for(int i = 0;i<arr.size();i++)
        {
            int a1[] = arr.get(i);
            char ch = (char)a1[0];
            while(a1[1]-->0)
            {
                st.append(ch);
            }
        }
        return st.toString();
    }
}