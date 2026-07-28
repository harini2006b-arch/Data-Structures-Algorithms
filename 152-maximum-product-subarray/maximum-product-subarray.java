class Solution {
    public int maxProduct(int[] nums) {
        int mp = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i]; 
            if (currentNum < 0) {
                int temp = max;
                max = min;
                min = temp; 
            }
            max = Math.max(currentNum, currentNum * max);
            min = Math.min(currentNum, currentNum * min);
            
            mp = Math.max(mp, max);
        }
        return mp;
    }
}
