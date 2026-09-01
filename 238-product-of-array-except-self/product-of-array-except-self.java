class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fix = new int[nums.length];
        
        int pre = 1;
        for (int i = 0; i < nums.length; i++) {
            fix[i] = pre;
            pre *= nums[i];
        }
        
        int suf = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            fix[i] *= suf;
            suf *= nums[i];
        }
        
        return fix;
    }
}
