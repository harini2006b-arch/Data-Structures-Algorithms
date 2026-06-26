using System;
public class Solution {
    public int MaxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currentsum=0;
        foreach(int num in nums){
            currentsum+=num;
            if(currentsum>maxsum) maxsum=currentsum;          
        
        if (currentsum < 0) currentsum = 0;
        }
        
        return maxsum;
    }
}
