class Solution {
    public int mirrorDistance(int n) {
        int a = n;
        int rev = 0;
        while(a>0){
            int rem = a%10;
            rev = rev*10+rem;
            a/=10;

        }
        return Math.abs(rev-n);
    }
}