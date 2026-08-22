class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int pro = 1;
        while(temp>0){
            int rem = temp %10;
            sum = sum+ rem;
            pro = pro*rem;
            temp /=10;

        }
        int finalsum = sum+pro;
        return n % finalsum == 0;
        
    }
}