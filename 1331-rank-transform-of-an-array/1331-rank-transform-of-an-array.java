class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int [] sorted = arr.clone();
        int [] ans = new int[n];
        Arrays.sort(sorted);
        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:sorted){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }
        for(int i = 0;i<n;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}