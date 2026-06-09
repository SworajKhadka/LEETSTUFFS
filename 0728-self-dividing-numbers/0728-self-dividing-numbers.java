class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int num=left;num<=right;num++){
            int curr = num;
            int count = 0;
            int digits = 0;
            while(curr>0){
                int rem = curr%10;
                if(rem==0){
                    count = -100;
                    break;
                }
                if(num%rem==0){
                    count++;
                }
                curr = curr/10;
                digits++;
            }
            if(count==digits)ans.add(num);
        } 
        return ans;
        
    }
}