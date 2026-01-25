class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split("\\s+");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> mapCS = new HashMap<>();
        HashMap<String, Character> mapSC = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String c2 = words[i];

            // char -> word
            if (mapCS.containsKey(c1)) {
                if (!mapCS.get(c1).equals(c2)) {
                    return false;
                }
            } else {
                mapCS.put(c1, c2);
            }

            // word -> char
            if (mapSC.containsKey(c2)) {
                if (mapSC.get(c2) != c1) {
                    return false;
                }
            } else {
                mapSC.put(c2, c1);
            }
        }

        return true;
    }
}
