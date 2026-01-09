class Solution {
    public int titleToNumber(String columnTitle) {
        int results = 0;
        for (int i=0;i<columnTitle.length();i++){
            char ab = columnTitle.charAt(i);
            results = results*26 +(ab-'A'+1);

        }
        return results ;
    }
}