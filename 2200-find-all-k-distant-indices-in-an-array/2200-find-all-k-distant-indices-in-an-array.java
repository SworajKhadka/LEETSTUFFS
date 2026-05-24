class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        for(int j = 0; j < nums.length; j++){

            if(nums[j] == key){

                int left = Math.max(0, j - k);
                int right = Math.min(nums.length - 1, j + k);

                for(int i = left; i <= right; i++){

                    if(!visited[i]){
                        result.add(i);
                        visited[i] = true;
                    }
                }
            }
        }

        return result;
    }
}