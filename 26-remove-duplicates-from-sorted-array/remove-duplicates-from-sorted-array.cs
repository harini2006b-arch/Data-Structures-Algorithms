using System.Collections.Generic;

public class Solution {
    public int RemoveDuplicates(int[] nums) {
        HashSet<int> seen = new HashSet<int>();
        for(int i = 0; i < nums.Length; i++) { 
        seen.Add(nums[i]); 
        }
        int k = 0;
        foreach(int num in seen) {
            nums[k] = num;
            k++;
        }
        return k; 
    }
}
