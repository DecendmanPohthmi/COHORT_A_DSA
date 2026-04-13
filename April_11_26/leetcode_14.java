package April_11_26;

public class leetcode_14 {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = findPrefix(prefix, strs[i]);

            if (prefix.length() == 0) return "";
        }

        return prefix;
    }

    private String findPrefix(String s1, String s2) {
        int i = 0;

        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) break;
            i++;
        }

        return s1.substring(0, i);
    }

    // Main method to test
    public static void main(String[] args) {
        leetcode_14 sol = new leetcode_14();

        String[] strs = {"flower", "flow", "flight"};

        String result = sol.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}