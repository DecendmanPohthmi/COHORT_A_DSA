package April_29_26;

public class leetcode_392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (j < t.length()) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
            if(i == s.length()){
                return true;
            }
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        leetcode_392 sol = new leetcode_392();
        String s = "abc";
        String t = "ahbgdc";

        boolean res = sol.isSubsequence(s, t);
        System.out.println(res);
    }
}
