class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:friends){
            set.add(num);
        }
        int index=0;
        int res[]=new int[friends.length];
        for(int nums:order){
            if(set.contains(nums)){
                res[index]=nums;
                index++;
            }
        }
        return res;
    }
}