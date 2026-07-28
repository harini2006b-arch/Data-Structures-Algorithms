class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int gs=0,cs=0;
        for (int i=0;i<k;i++){
            cs+=nums[i];
        }
        gs=cs;
        for(int i=k;i<nums.length;i++){
            cs+=nums[i]-nums[i-k];
            gs=Math.max(gs,cs);
        }
        return (double) gs/k;
    }
}