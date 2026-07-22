class Solution {
    public int alternateDigitSum(int n) {
        
        int sum=0;
        int sign=1;
      

        while(n>0){
            int ld=n%10;
            sum+=ld*sign;
            sign = -sign;
            n/=10;
        }
        return (sign==-1)? sum:-sum;

        
    }
}