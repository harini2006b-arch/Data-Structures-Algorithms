class Solution {
    public int subtractProductAndSum(int n) {
        int product=1, sum=0, ld=0;

    	while(n>0) {
    		ld=n%10;
    		product*=ld;
    		sum+=ld;
    		n=n/10;
    	}	
        return product-sum;
        
        }
        
    }
