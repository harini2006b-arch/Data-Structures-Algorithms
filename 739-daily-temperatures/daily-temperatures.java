class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int result[]=new int[temperatures.length];
        int count=0;
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            result[i]=(stack.isEmpty()?0:stack.peek()-i);
            stack.push(i);
        }
        return result;
    }
}