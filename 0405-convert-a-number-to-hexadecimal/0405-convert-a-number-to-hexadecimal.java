class Solution {
    public String toHex(int num) {
        if (num==0)return "0";
        char []hex="0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<8 && num!=0 ;i++){
            int lastfourdigit = num & 15;
            result.append(hex[lastfourdigit]);
            num>>>=4;

        }
        return result.reverse().toString();
    }
}