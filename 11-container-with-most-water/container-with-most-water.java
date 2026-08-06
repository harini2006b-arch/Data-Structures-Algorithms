class Solution {
    public int maxArea(int[] height) {
        int Maxarea=0;
        int Maxheight=0;
        
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            Maxheight=Math.min(height[left],height[right]);
            int area=width * Maxheight;
            Maxarea=Math.max(Maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        return Maxarea;
    }
}