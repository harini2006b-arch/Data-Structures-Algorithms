class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[]=new int[nums.length*2];
        int index=0;
        for(int i=0;i<nums.length;i++){
            res[index]=nums[i];
            index++;
        }

        for(int i=nums.length-1;i>=0;i--){
            res[index++]=nums[i];
        }
        
        return res;
        
    }
}