class Solution {
    public boolean isPowerOfTwo(int n) {
        // while(n%2 == 0){
        //     n/=10;
        // }
        // return n==1;
        return (n > 0) && (n & (n-1)) == 0;
    }
}