class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
        List<List<String>> ans = new ArrayList<>();
        int n=strs.length;
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String one = strs[i];
            char[] chars =one.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(one);


        }

        for(List<String> s:map.values()){
            ans.add(s);

        }
        return ans;

        
    }
}