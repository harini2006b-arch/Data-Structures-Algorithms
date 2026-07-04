public class Solution {
    public int ThirdMax(int[] nums) {
        HashSet<int> set1 = new HashSet<int>(nums);
        List<int> set2 = new List<int>(set1);
        set2.Sort();
        set2.Reverse();
        if(set2.Count==1||set2.Count==2){
            return set2.Max();
        }
        int ans=set2[2];
        return ans;
        
    }
}