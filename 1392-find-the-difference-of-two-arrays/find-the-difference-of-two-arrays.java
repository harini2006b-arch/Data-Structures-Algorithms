class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int num : nums1){
            if(!list1.contains(num)) {
                list1.add(num);
            }
        }
        
        List<Integer> list2 = new ArrayList<>();
        for(int num : nums2){
            if(!list2.contains(num)) {
                list2.add(num);
            }
        }
        
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        
        for(int num : list1){
            if(!list2.contains(num)){
                ans1.add(num);
            }
        }
        
        for(int num : list2){
            if(!list1.contains(num)){
                ans2.add(num);
            }
        }
        return Arrays.asList(ans1, ans2);
    }
}
