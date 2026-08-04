class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int num:nums){
            al.add(num);
        }
        
        while(al.contains(val)){
            al.remove(Integer.valueOf(val));
        }

        for(int i=0;i<al.size();i++){
            nums[i]=al.get(i);
        }

        return al.size();
    }
}