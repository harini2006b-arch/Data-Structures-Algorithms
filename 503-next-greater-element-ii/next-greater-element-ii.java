class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int res[]=new int[n];
        Arrays.fill(res,-1);

        for(int i=0;i<2*n;i++){
            int current=nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()] < current){
                int index=stack.pop();
                res[index]=current;
            }
            if(i<n){
                stack.push(i);
            }
        }
        return res;

    }
}