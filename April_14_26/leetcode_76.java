package April_14_26;

public class leetcode_76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length() || s.length() == 0) return "";

        int s_index = -1;
        int min_len = Integer.MAX_VALUE;

        int count = 0;
        int right = 0;
        int left = 0;

        int[] freq = new int[128];
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        while(right < s.length()) {
            if(freq[s.charAt(right)] > 0) {
                count++;
            }
            freq[s.charAt(right)]--;

            while(count == t.length()) {
                if(right - left + 1 < min_len) {
                    min_len = right - left + 1;
                    s_index = left;
                }

                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)] > 0) {
                    count--;
                }
                left++;
            }
            right++;
        }
        
        if (s_index == -1) return "";
        return s.substring(s_index, s_index + min_len);
    }

    public static void main(String[] args) {
        leetcode_76 sol = new leetcode_76();
        String result = sol.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(result);
    }
}
