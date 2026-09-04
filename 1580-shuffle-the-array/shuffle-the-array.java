class Solution {
    public int[] shuffle(int[] nums, int n) {
        int h=nums.length;
        int res[]=new int[h];
        int index=0;
        for(int i=0;i<n;i++){
            res[index]=nums[i];
            index++;
            res[index]=nums[i+n];
            index++;
        }
        return res;
    }
}