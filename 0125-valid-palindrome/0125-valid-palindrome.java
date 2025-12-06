class Solution {
    public boolean isPalindrome(String s) {
        String Str = s.toLowerCase();
        String cstr = Str.replaceAll("[^a-z0-9]", "");

        String pal = "";
        for (int i = cstr.length() - 1; i >= 0; i--) {
            pal += cstr.charAt(i);
        }

        return cstr.equals(pal);
    }
}
