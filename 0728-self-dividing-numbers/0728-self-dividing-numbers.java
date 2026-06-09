class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for(int num=left;num<=right;num++){
            int curr = num;
            boolean isdiv = true;
            while(curr>0){
                int rem = curr%10;
                if(rem ==0 || num%rem !=0){
                    isdiv = false;
                }
                curr = curr/10;
            }
            if(isdiv==true){
                ans.add(num);
            }
        } 
        return ans;
        
    }
}