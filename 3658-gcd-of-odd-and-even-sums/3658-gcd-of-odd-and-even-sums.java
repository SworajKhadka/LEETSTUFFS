class Solution {
    public int gcdOfOddEvenSums(int n) {
        int osum = 0;
        int esum = 0;
        for(int i = 1;i<=2*n;i++){
            if(i%2==0){
                esum+=i;
            }
            else{
                osum+=i;
            }
        }
        while(osum!=0){
            int temp = osum;
            osum = esum % osum; 
            esum = temp;
        }
        return esum;
    }
}