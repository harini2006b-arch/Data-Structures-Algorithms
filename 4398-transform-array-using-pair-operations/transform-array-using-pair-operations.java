class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long ssum=0;
        long tsum=0;
        for(int i=0;i<source.length;i++){
            ssum+=source[i];
            tsum+=target[i];
        }
     return ssum==tsum;      
    }
}