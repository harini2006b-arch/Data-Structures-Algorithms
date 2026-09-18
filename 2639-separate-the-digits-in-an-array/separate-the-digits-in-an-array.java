class Solution {
    public int[] separateDigits(int[] nums) {
    List<Integer>li=new ArrayList<>();
    for(int num:nums){
        List<Integer>temp=new ArrayList<>();
        while(num>0){
            temp.add(num%10);
            num/=10;
        }
        Collections.reverse(temp);
        li.addAll(temp);
    }
    int arr[]=new int[li.size()];
    for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}