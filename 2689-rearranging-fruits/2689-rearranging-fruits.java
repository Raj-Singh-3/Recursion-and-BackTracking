class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> freq = new TreeMap<>();
        int n = basket1.length;
        
        // Count frequency of each fruit in both baskets
        for (int i = 0; i < n; i++) {
            freq.put(basket1[i], freq.getOrDefault(basket1[i], 0) + 1);
            freq.put(basket2[i], freq.getOrDefault(basket2[i], 0) - 1);
        }
        
        List<Integer> toMove = new ArrayList<>();
        int globalMin = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int fruit = entry.getKey();
            int count = entry.getValue();
            globalMin = Math.min(globalMin, fruit);
            
            // If count is odd, impossible to balance
            if (count % 2 != 0) return -1;
            
            // We only need to move half of the difference
            for (int i = 0; i < Math.abs(count) / 2; i++) {
                toMove.add(fruit);
            }
        }
        
        // We sort the toMove list, and greedily swap the smallest elements
        Collections.sort(toMove);
        long cost = 0;
        
        for (int i = 0; i < toMove.size() / 2; i++) {
            cost += Math.min(toMove.get(i), 2 * globalMin);
        }
        
        return cost;
    }
}
