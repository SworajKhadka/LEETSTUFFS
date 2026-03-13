class Solution {
    public int maxProduct(int n) {
        int a = 0;//first max
        int b = 0;//second max
        while(n>0){
            int x = n%10;
            if(x>a){
                b=a;
                a=x;
            }
            else if(x>b){
                b=x;
            }
            n=n/10;
        }
        return a*b;
    }
}