public class Solution {
    public int HeightChecker(int[] heights) {
        int count=0;
        List<int> stored=new List<int>(heights);
        stored.Sort();
        for(int i=0;i<stored.Count;i++){
            if(heights[i]!=stored[i]){
                count++;
            }
        }
        return count;
    }
}