class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while(n>0){
            int x = n%10;
            product = product * x;
            sum = sum + x;
            n = n / 
              
        }
        return product - sum;
    }
}
