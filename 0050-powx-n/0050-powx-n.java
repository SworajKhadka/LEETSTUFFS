class Solution {
    public double myPow(double x, int n) {
        //here we have to convert the power to be raised to the binary digits so I'm using a BinForm keyword to do so
        long BinForm = n;
        if(n<0){
            x=1/x;
            BinForm=-BinForm;
        }
        double ans=1;
        while(BinForm>0){
            if(BinForm%2==1){
                ans*=x;
            }
            x=x*x;
            BinForm/=2;
        }

        return ans;
        
    }
}