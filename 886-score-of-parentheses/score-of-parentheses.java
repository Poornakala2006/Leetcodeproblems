
class Solution {
    public int scoreOfParentheses(String s) {

        int opening = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                opening++;
            } else {
                
                opening--;
                if (s.charAt(i - 1) == '(') {
                    res += (int) Math.pow(2, opening);
                }
            }
        }
        return res;
    }
}