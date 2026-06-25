
class Solution {
   public int findDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    int duplicate = 0;
    for(int n:nums){
        if(!set.contains(n)){
            set.add(n);
        }
        else{
            duplicate = n;
        }
    }
    return duplicate;
   }
}
