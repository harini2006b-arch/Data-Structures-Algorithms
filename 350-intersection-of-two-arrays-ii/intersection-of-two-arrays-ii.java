class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int num:nums2){
            list.add(num);
        }
        List<Integer>result=new ArrayList<>();
        for(int num:nums1){
            if(list.contains(num)){
                result.add(num);
                list.remove(Integer.valueOf(num));
            }
        }
        int[] finalres=new int[result.size()];
        for(int i=0;i<result.size();i++){
            finalres[i]=result.get(i);
        }
        return finalres;
    }
}