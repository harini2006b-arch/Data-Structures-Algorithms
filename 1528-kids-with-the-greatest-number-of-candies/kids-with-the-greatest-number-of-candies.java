import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandy=0;
        for(int c:candies){
            if(c>maxcandy){
                maxcandy=c;
            }
        }
     List<Boolean>result =new ArrayList<Boolean>();
     for(int c:candies){
        if(c+extraCandies>=maxcandy){
            result.add(true);
        }
        else{
            result.add(false);

        }
     }
        return result;
    }
}