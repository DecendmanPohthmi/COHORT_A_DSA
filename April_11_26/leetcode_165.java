package April_11_26;

public class leetcode_165 {
    public int compareVersion(String version1, String version2) {
        int n = version1.length();
        int m = version2.length();

        int idx1 = 0, idx2 = 0;
        while(idx1 < n || idx2 < m) {
            int val1 = 0, val2 = 0;
            while(idx1 < n && version1.charAt(idx1) == '0') {
                idx1++;
            }

            while(idx1 < n && version1.charAt(idx1) != '.') {
                val1 = val1 * 10 + (version1.charAt(idx1) - '0');
                idx1++;
            }

            idx1++;

            while(idx2 < m && version2.charAt(idx2) == '0') {
                idx2++;
            }

            while(idx2 < m && version2.charAt(idx2) != '.') {
                val2 = val2 * 10 + (version2.charAt(idx2) - '0');
                idx2++;
            }

            idx2++;

            if(val1 < val2) return -1;
            if(val1 > val2) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        leetcode_165 sol = new leetcode_165();

        int result = sol.compareVersion("1.1", "1.10");
        System.out.println(result);

    }
}