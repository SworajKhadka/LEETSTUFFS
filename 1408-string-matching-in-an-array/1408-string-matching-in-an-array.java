class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()>words[j].length()){
                    if(words[i].indexOf(words[j])!=-1){
                        ans.add(words[j]);
                    }
                }
                else if(words[j].length()>words[i].length()){
                    if(words[j].indexOf(words[i])!=-1){
                        ans.add(words[i]);
                    }
                }
                

            }
        }
        HashSet<String> fans = new HashSet<>(ans);
        return new ArrayList<>(fans);

    }
}