class Solution {
    public String reverseWords(String s) {

        String[] ans = s.split("\\s+");
        StringBuilder words = new StringBuilder();

        for (String i : ans) {
            StringBuilder fans = new StringBuilder();

            for (int j = i.length() - 1; j >= 0; j--) {
                fans.append(i.charAt(j));
            }

            words.append(fans).append(" ");
        }

        return words.toString().trim();
    }
}
