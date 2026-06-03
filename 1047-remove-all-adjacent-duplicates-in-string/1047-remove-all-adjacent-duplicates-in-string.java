class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        char [] ans = s.toCharArray();
        stack.push(ans[0]);
        for(int i=1;i<n;i++){
            if(stack.isEmpty()){
                stack.push(ans[i]);
                continue;
            }
            char c = stack.peek();
            if(c==ans[i]){
                stack.pop();
            }
            else{
                stack.push(ans[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();

        
    }
}