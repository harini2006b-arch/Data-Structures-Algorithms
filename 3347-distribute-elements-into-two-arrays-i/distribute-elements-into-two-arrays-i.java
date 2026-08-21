class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>arr1=new ArrayList<>();
        List<Integer>arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int one=arr1.get(arr1.size()-1);
            int two=arr2.get(arr2.size()-1);
            if(one>two){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int res[]=new int[nums.length];
        int index=0;
        for(int num : arr1){
            res[index++]=num;
        }
        for(int num : arr2){
            res[index++]=num;
        }
        return res;

        
        
        
    }
}