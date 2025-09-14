class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        String arr[] = s1.split("\\s+");
        int i = 0, j = arr.length-1;
        String res = "";
        while(i<j)
        {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            String x = arr[i];
            res =res + x.trim() +" ";
            i++;
            j--;
        }
        while(i<arr.length)
        {
            String x = arr[i];
            res =res+  x.trim() +" ";
            i++;
        }
        return res.trim();
    }
}