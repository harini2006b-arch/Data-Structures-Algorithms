class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean negative=(dividend<0)^(divisor<0); //false
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int answer=0;
        while (a >= b) {
            long d = b;
            long count = 1;

            while (d+d <= a) {
                d = d + d;
                count = count + count;
            }
            a = a-d;
            answer = answer+(int)count;
        }

        if (negative) {
            answer = -answer;
        }

        return (int) answer;
    }
}