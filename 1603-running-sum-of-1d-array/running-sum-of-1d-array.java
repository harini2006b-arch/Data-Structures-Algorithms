class Solution {
    public int[] runningSum(int[] nums) {
        int[] a=new int[nums.length];
        int sum=0;
        int index=0;
        for(int b:nums){
            sum=sum+b;
            a[index]=sum;
            index++;
            
        }
        return a;
        
    }
    }
