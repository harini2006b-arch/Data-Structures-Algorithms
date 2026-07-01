using System;

using System.Linq;
public class Solution {
    public int MissingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<=nums.Length;i++){
            if(!nums.Contains(i)){
                return i;
            }
        }
    

        return ans;
    }
}