import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[]res=new int[nums.length];
        int rightSum=0;
        for(int num:nums){
            rightSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            res[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return res;
        }
}