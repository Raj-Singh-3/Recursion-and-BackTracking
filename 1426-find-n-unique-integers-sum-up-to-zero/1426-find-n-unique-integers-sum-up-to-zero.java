class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        if(n%2 == 0)
        {
            int a = 1;
            for(int i=1;i<n;i+=2)
            {
                arr[i] = -1*a;
                arr[i-1] = a;
                a++;
            } 
        }
        else
        {
            int a = 1;
            for(int i=0;i<n-1;i+=2)
            {
                arr[i] = a;
                arr[i+1] = -1*a;
                
                a++;
            } 
            arr[n-1] = 0;
        }
        return arr;
    }
}