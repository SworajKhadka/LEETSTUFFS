class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber!=0){

            columnNumber--;
            char ab  = (char) ((columnNumber%26)+'A');
            sb.append(ab);
            columnNumber/=26;
        }

    return sb.reverse().toString();
}
}
