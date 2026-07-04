public class Solution {
    public bool IsPerfectSquare(int num) {
        long i=1;
        while(i*i<num){
            i++;
        }
        return i*i==num;
    }
}