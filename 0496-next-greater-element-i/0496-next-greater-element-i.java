class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> ht = new HashMap<Integer,Integer>();
        int i = 0;
        int n = nums2.length;
        for(int num: nums2)
        {
            ht.put(num,i);
            i++;
        }
        i = 0;
        int flag = 0;
        for(int num : nums1)
        {
            int idx = ht.get(num);
            idx++;
            flag = 0;
            while(idx<n)
            {
                if(nums2[idx]>num)
                {
                    nums1[i] = nums2[idx];
                    flag = 1;
                    break;
                }
                idx++;
            }
            if(flag == 0)
            { 
                nums1[i] = -1;
            }
    
            i++;
        }
        return nums1;
    }
}