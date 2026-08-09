class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String local = parts[0];

            // Ignore everything after '+'
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // Remove all '.'
            local = local.replace(".", "");

            String normalized = local + "@" + parts[1];

            set.add(normalized);
        }

        return set.size();
    }
}