class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
        }
        int maxlen=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
            maxlen=Math.max(dp[i],maxlen);

        }
        return maxlen;
    }
}