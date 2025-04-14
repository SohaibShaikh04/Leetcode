class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        int n=arr.length;
      
        for(int i=0;i<n-2;i++){
            for(int j=i+1;i<n-1;i++){
                for(int k=j+1;i<n;i++){
                    int diff1 = Math.abs(arr[i]-arr[j]);
                    int diff2 = Math.abs(arr[j]-arr[k]);
                    int diff3 = Math.abs(arr[i]-arr[k]);
                    if(diff1 <=a && diff2 <=b && diff3 <=c )
                    {
                    count++;
                    }
                }
            }
        }
         return count;
    }
}