class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs=new HashSet<>();
        HashSet<Integer>intersection=new HashSet<>();
        for(int num:nums1){
            hs.add(num);
        }
        for(int nums:nums2){
            if(hs.contains(nums)){
                intersection.add(nums);
            }
        }
        int[] arr=new int[intersection.size()];
        int index=0;
        for(int intersec:intersection){
            arr[index++]=intersec;
        }
        return arr;
    }
}