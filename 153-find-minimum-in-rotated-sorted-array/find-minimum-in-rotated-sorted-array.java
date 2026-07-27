class Solution {
    public int findMin(int[] nums) {
        // int l=0,r=arr.length-1;
        // int min=num[0];
        // while(l<=r){
        //     if(nums[l]<nums[r]){
        //         min=Math.min(min,nums[l]);
        //         break;
        //     }
        // }
        // int mid=(l+r)/2;
        // min=Math.min(min,nums[mid]);
        // if(nums[mid]>nums[l]){

        // }
        Arrays.sort(nums);
        return nums[0];
    }
}