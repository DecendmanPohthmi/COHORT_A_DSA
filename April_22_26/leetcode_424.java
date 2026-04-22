package April_22_26;

class leetcode_424 {
    public int characterReplacement(String s, int k) {
        char[] c = s.toCharArray();

        int left = 0, right = 0;
        int max_length = 0, max_freq = 0;

        int[] freq = new int[26];

        while (right < c.length) {
            freq[c[right] - 'A']++;

            max_freq = Math.max(max_freq, freq[c[right] - 'A']);

            while ((right - left + 1) - max_freq > k) {
                freq[c[left] - 'A']--;
                left++;

                max_freq = 0;
                for (int i = 0; i < 26; i++) {
                    max_freq = Math.max(max_freq, freq[i]);
                }
            }

            max_length = Math.max(max_length, right - left + 1);

            right++;
        }

        return max_length;
    }

    public static void main(String[] args) {
        leetcode_424 sol = new leetcode_424();
        int result = sol.characterReplacement("AABBBCBB", 2);
        System.out.println(result);
    }
}