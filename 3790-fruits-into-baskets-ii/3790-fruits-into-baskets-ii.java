class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (fruits[i] <= baskets[j] && !arr[j]) {
                    arr[j] = true;
                    break; 
                }
            }
        }
        
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (!arr[i]) {
                c++;
            }
        }
        return c;
    }
}
