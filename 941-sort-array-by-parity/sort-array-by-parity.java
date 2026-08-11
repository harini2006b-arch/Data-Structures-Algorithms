class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                res[index]=nums[i];
                index++;
            }
        }
        return res;
    }
}