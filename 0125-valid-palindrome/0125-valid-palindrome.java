class Solution {
    public boolean isPalindrome(String s) {
        String Str = s.toLowerCase();
        String cstr = Str.replaceAll("[^a-z0-9]", "");

        String pal = new StringBuilder(cstr).reverse().toString();

        return cstr.equals(pal);
    }
}
