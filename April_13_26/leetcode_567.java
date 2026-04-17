package April_13_26;

public class leetcode_567 {
    public boolean checkInclusion(String s1, String s2) {

        for(int i = 0; i <= s2.length() - s1.length(); i++) {
            String sub_string = s2.substring(i, i + s1.length());

            int[] count = new int[26];
            for (char c : sub_string.toCharArray()) {
                count[c - 'a']++;
            }
            for (char c : s1.toCharArray()) {
                count[c - 'a']--;
            }

            boolean match = true;
            for (int j = 0; j < 26; j++) {
                if (count[j] != 0) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode_567 sol = new leetcode_567();
        boolean result = sol.checkInclusion("ab", "eidbaooo");
        System.out.println(result);
    }
}
