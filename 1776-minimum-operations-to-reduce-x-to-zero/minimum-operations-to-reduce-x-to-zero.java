class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        if(total<x) return -1;
        long target=total-x;
        int n=nums.length;
        int left=0;
        long sum=0;
        int maxlen=-1;
        for(int right=0;right<n;++right){
            sum+=nums[right];
            while(sum>target && left<=right){
                sum-=nums[left];
                ++left;
            }
            if(sum==target){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        return maxlen==-1?-1:n-maxlen;
    }
}