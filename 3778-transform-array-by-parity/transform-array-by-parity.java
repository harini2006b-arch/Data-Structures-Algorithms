class Solution {
    public int[] transformArray(int[] nums) {
        return Arrays.stream(nums).map(num-> num%2==0?0:1).sorted().toArray();
        
        
    }
}