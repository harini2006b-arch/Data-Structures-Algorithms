public class Solution {
    public int MaximumDifference(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.Length;i++){
            for(int j=i+1;j<nums.Length;j++){
                if(nums[i]<nums[j]){
                    int diff=nums[j]-nums[i];
                    if(diff>max)
                    max=diff;
                }
            }
        }
        return max;
    }
}
