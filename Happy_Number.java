class Solution {
   public boolean isHappy(int n) {
        
       int sum,rem;
       
        while(n/10 > 0){
            
            sum = 0;
            while(n > 0) {
                sum += (n % 10)*(n % 10);
                n = n/10;
            }
            n = sum;
        }
        if(n == 1 || n == 7)
            return true;
        else
            return false;
    }
}
