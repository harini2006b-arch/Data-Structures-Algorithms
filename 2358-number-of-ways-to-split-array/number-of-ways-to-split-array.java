class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long prefix[]=new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int count=0;
        long totalsum=prefix[n-1];

        for(int i=0;i<n-1;i++){
        long leftsum=prefix[i];
        long rightsum=totalsum-prefix[i];
        if(leftsum>=rightsum){
            count++;
        }
        }
        return count;
    }
}