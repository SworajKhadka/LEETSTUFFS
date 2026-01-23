class Solution {
    public String convertToBase7(int num) {

        // Edge case
        if (num == 0) return "0";
        int abc = num;

        num = Math.abs(num);

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int remainder = num % 7;
            result.append(remainder);
            num /= 7;
        }

        if (abc<0) {
            result.append('-');
        }

        return result.reverse().toString();
    }
}
